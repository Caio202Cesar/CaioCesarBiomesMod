package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeAmbience;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.SoundAdditionsAmbience;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Optional;

@Mixin(BiomeAmbience.class)
public abstract class BiomeAmbienceMixin implements MutableBiomeAmbience {

    @Shadow @Final @Mutable
    private Optional<SoundEvent> ambientSound;

    @Shadow @Final @Mutable
    private Optional<MoodSoundAmbience> moodSound;

    @Shadow @Final @Mutable
    private Optional<SoundAdditionsAmbience> additionsSound;

    @Shadow @Final @Mutable
    private Optional<BackgroundMusicSelector> music;

    @Override
    public void setAmbientSound(Optional<SoundEvent> sound) {
        this.ambientSound = sound;
    }

    @Override
    public void setMoodSound(Optional<MoodSoundAmbience> mood) {
        this.moodSound = mood;
    }

    @Override
    public void setAdditionsSound(Optional<SoundAdditionsAmbience> additions) {
        this.additionsSound = additions;
    }

    @Override
    public void setMusic(Optional<BackgroundMusicSelector> music) {
        this.music = music;
    }
}
