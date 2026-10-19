package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeConfig {
    public static final int $stable = 8;

    @b("header")
    private final HeaderConfig header;

    @b("open_config")
    private final OpenConfig openConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, HeaderConfig headerConfig, OpenConfig openConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerConfig = homeConfig.header;
        }
        if ((i10 & 2) != 0) {
            openConfig = homeConfig.openConfig;
        }
        return homeConfig.copy(headerConfig, openConfig);
    }

    public final HeaderConfig component1() {
        return this.header;
    }

    public final OpenConfig component2() {
        return this.openConfig;
    }

    public final HomeConfig copy(HeaderConfig header, OpenConfig openConfig) {
        i.e(header, "header");
        i.e(openConfig, "openConfig");
        return new HomeConfig(header, openConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) obj;
        return i.a(this.header, homeConfig.header) && i.a(this.openConfig, homeConfig.openConfig);
    }

    public final HeaderConfig getHeader() {
        return this.header;
    }

    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }

    public int hashCode() {
        return this.openConfig.hashCode() + (this.header.hashCode() * 31);
    }

    public String toString() {
        return "HomeConfig(header=" + this.header + ", openConfig=" + this.openConfig + ')';
    }

    public HomeConfig(HeaderConfig header, OpenConfig openConfig) {
        i.e(header, "header");
        i.e(openConfig, "openConfig");
        this.header = header;
        this.openConfig = openConfig;
    }

    public /* synthetic */ HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig, int i10, e eVar) {
        if ((i10 & 1) != 0) {
            headerConfig = new HeaderConfig(null, null, false, 7, null);
        }
        if ((i10 & 2) != 0) {
            openConfig = new OpenConfig(null, null, null, 7, null);
        }
        this(headerConfig, openConfig);
    }
}
