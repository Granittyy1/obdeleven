package okio.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p318zb.z;

/* JADX INFO: compiled from: ZipEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f45728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f45736i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f45737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f45738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f45739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f45740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f45741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f45742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f45743q;

    public g(z canonicalPath, boolean z10, String comment, long j, long j10, long j11, int i10, long j12, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        i.e(canonicalPath, "canonicalPath");
        i.e(comment, "comment");
        this.f45728a = canonicalPath;
        this.f45729b = z10;
        this.f45730c = comment;
        this.f45731d = j;
        this.f45732e = j10;
        this.f45733f = j11;
        this.f45734g = i10;
        this.f45735h = j12;
        this.f45736i = i11;
        this.j = i12;
        this.f45737k = l10;
        this.f45738l = l11;
        this.f45739m = l12;
        this.f45740n = num;
        this.f45741o = num2;
        this.f45742p = num3;
        this.f45743q = new ArrayList();
    }

    public /* synthetic */ g(z zVar, boolean z10, String str, long j, long j10, long j11, int i10, long j12, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(zVar, z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j, (i13 & 16) != 0 ? -1L : j10, (i13 & 32) != 0 ? -1L : j11, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j12, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
