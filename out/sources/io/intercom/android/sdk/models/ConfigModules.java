package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfigModules {
    private static final ConfigModules DEFAULT;
    private static final ConfigModules DEFAULT_WITH_ACTION_COLORS;

    @b("customization")
    private final CustomizationModel customization;

    @b("home")
    private final HomeConfig home;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ConfigModules.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ConfigModules getDEFAULT() {
            return ConfigModules.DEFAULT;
        }

        public final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
            return ConfigModules.DEFAULT_WITH_ACTION_COLORS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT_WITH_ACTION_COLORS$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 60;
        e eVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i11 = 60;
        e eVar2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        int i12 = 2;
        DEFAULT = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("", "", null, null, null, null, 60, null), new CustomizationColorsModel("", "", str, str2, str3, str4, i10, eVar), objArr2, "", "", new CustomizationColorsModel("", "", str5, str6, str7, str8, i11, eVar2), 0, objArr, null, "", null, 0, 4, null), 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        Object[] objArr3 = 0 == true ? 1 : 0;
        DEFAULT_WITH_ACTION_COLORS = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("#000000", "#FFFFFF", "#FFFFFF", null, null, null, 56, null), new CustomizationColorsModel("#000000", "#FAFAFA", str, str2, str3, str4, i10, eVar), null, "", "", new CustomizationColorsModel("", "", str5, str6, str7, str8, i11, eVar2), 0, objArr3, null, "", null, 0, 4, null), 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
    }

    public ConfigModules(CustomizationModel customization, HomeConfig home) {
        i.e(customization, "customization");
        i.e(home, "home");
        this.customization = customization;
        this.home = home;
    }

    public static /* synthetic */ ConfigModules copy$default(ConfigModules configModules, CustomizationModel customizationModel, HomeConfig homeConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customizationModel = configModules.customization;
        }
        if ((i10 & 2) != 0) {
            homeConfig = configModules.home;
        }
        return configModules.copy(customizationModel, homeConfig);
    }

    public static final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
        return Companion.getDEFAULT_WITH_ACTION_COLORS();
    }

    public final CustomizationModel component1() {
        return this.customization;
    }

    public final HomeConfig component2() {
        return this.home;
    }

    public final ConfigModules copy(CustomizationModel customization, HomeConfig home) {
        i.e(customization, "customization");
        i.e(home, "home");
        return new ConfigModules(customization, home);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigModules)) {
            return false;
        }
        ConfigModules configModules = (ConfigModules) obj;
        return i.a(this.customization, configModules.customization) && i.a(this.home, configModules.home);
    }

    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    public final HomeConfig getHome() {
        return this.home;
    }

    public int hashCode() {
        return this.home.hashCode() + (this.customization.hashCode() * 31);
    }

    public String toString() {
        return "ConfigModules(customization=" + this.customization + ", home=" + this.home + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig, int i10, e eVar) {
        if ((i10 & 2) != 0) {
            homeConfig = new HomeConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(customizationModel, homeConfig);
    }
}
