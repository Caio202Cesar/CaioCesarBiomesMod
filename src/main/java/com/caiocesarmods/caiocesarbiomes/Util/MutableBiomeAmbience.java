package com.caiocesarmods.caiocesarbiomes.Util;

import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.SoundAdditionsAmbience;

import java.util.Optional;

public interface MutableBiomeAmbience {

    void setAmbientSound(Optional<SoundEvent> sound);

    void setMoodSound(Optional<MoodSoundAmbience> mood);

    void setAdditionsSound(Optional<SoundAdditionsAmbience> additions);

    void setMusic(Optional<BackgroundMusicSelector> music);
}