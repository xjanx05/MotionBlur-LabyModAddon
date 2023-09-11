package de.atirionstudios.core;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@ConfigName("settings")
public class MotionBlurConfiguration extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SettingSection(value = "valuesSetting")
  @SliderSetting(min = 0, max = 100)
  private final ConfigProperty<Float> value = new ConfigProperty<>(50f);

  @KeyBindSetting
  private final ConfigProperty<Key> key = new ConfigProperty<>(Key.H);

  @Override
  public ConfigProperty<Boolean> enabled() {
    return this.enabled;
  }


  public ConfigProperty<Float> value() {
    return value;
  }
}
