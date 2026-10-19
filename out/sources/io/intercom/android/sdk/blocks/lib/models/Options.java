package io.intercom.android.sdk.blocks.lib.models;

import I7.b;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: TicketTypeV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Options {
    public static final int $stable = 8;

    @b("accept")
    private final String accept;

    @b("list_options")
    private final List<ListOption> listOptions;

    @b("multiline")
    private final boolean multiline;

    public Options() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Options copy$default(Options options, boolean z10, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = options.multiline;
        }
        if ((i10 & 2) != 0) {
            list = options.listOptions;
        }
        if ((i10 & 4) != 0) {
            str = options.accept;
        }
        return options.copy(z10, list, str);
    }

    public final boolean component1() {
        return this.multiline;
    }

    public final List<ListOption> component2() {
        return this.listOptions;
    }

    public final String component3() {
        return this.accept;
    }

    public final Options copy(boolean z10, List<ListOption> listOptions, String accept) {
        i.e(listOptions, "listOptions");
        i.e(accept, "accept");
        return new Options(z10, listOptions, accept);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.multiline == options.multiline && i.a(this.listOptions, options.listOptions) && i.a(this.accept, options.accept);
    }

    public final String getAccept() {
        return this.accept;
    }

    public final List<ListOption> getListOptions() {
        return this.listOptions;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public int hashCode() {
        return this.accept.hashCode() + p.d(Boolean.hashCode(this.multiline) * 31, 31, this.listOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Options(multiline=");
        sb2.append(this.multiline);
        sb2.append(", listOptions=");
        sb2.append(this.listOptions);
        sb2.append(", accept=");
        return B7.b.g(sb2, this.accept, ')');
    }

    public Options(boolean z10, List<ListOption> listOptions, String accept) {
        i.e(listOptions, "listOptions");
        i.e(accept, "accept");
        this.multiline = z10;
        this.listOptions = listOptions;
        this.accept = accept;
    }

    public Options(boolean z10, List list, String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? EmptyList.f42983b : list, (i10 & 4) != 0 ? "" : str);
    }
}
