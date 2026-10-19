package io.intercom.android.sdk.models;

import I7.b;
import Z3.o;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderConfig {
    public static final int $stable = 8;

    @b("background")
    private final HeaderBackgroundModel background;

    @b("content")
    private final HeaderContentModel content;

    @b("header_expanded")
    private final boolean headerExpanded;

    public HeaderConfig() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ HeaderConfig copy$default(HeaderConfig headerConfig, HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerBackgroundModel = headerConfig.background;
        }
        if ((i10 & 2) != 0) {
            headerContentModel = headerConfig.content;
        }
        if ((i10 & 4) != 0) {
            z10 = headerConfig.headerExpanded;
        }
        return headerConfig.copy(headerBackgroundModel, headerContentModel, z10);
    }

    public final HeaderBackgroundModel component1() {
        return this.background;
    }

    public final HeaderContentModel component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.headerExpanded;
    }

    public final HeaderConfig copy(HeaderBackgroundModel background, HeaderContentModel content, boolean z10) {
        i.e(background, "background");
        i.e(content, "content");
        return new HeaderConfig(background, content, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderConfig)) {
            return false;
        }
        HeaderConfig headerConfig = (HeaderConfig) obj;
        return i.a(this.background, headerConfig.background) && i.a(this.content, headerConfig.content) && this.headerExpanded == headerConfig.headerExpanded;
    }

    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    public final HeaderContentModel getContent() {
        return this.content;
    }

    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.headerExpanded) + ((this.content.hashCode() + (this.background.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderConfig(background=");
        sb2.append(this.background);
        sb2.append(", content=");
        sb2.append(this.content);
        sb2.append(", headerExpanded=");
        return o.d(sb2, this.headerExpanded, ')');
    }

    public HeaderConfig(HeaderBackgroundModel background, HeaderContentModel content, boolean z10) {
        i.e(background, "background");
        i.e(content, "content");
        this.background = background;
        this.content = content;
        this.headerExpanded = z10;
    }

    public /* synthetic */ HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, e eVar) {
        this((i10 & 1) != 0 ? new HeaderBackgroundModel(null, null, null, null, null, null, false, null, null, null, false, 2047, null) : headerBackgroundModel, (i10 & 2) != 0 ? new HeaderContentModel(null, null, false, null, null, null, null, null, 255, null) : headerContentModel, (i10 & 4) != 0 ? true : z10);
    }
}
