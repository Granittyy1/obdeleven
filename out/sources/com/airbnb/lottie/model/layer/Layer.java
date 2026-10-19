package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import p005a4.t;
import p154m3.i;
import p154m3.j;
import p202q3.C2766j;

/* JADX INFO: loaded from: classes.dex */
public final class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p164n3.b> f23444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p079g3.b f23445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerType f23448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Mask> f23451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f23452i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f23454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f23455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f23456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f23457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f23458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f23459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.ui.autofill.a f23460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p154m3.b f23461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<p225s3.a<Float>> f23462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MatteType f23463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f23464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f23465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2766j f23466x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LayerType f23467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final LayerType f23468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final LayerType f23469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LayerType[] f23470e;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            f23467b = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            LayerType layerType3 = new LayerType("IMAGE", 2);
            f23468c = layerType3;
            LayerType layerType4 = new LayerType("NULL", 3);
            LayerType layerType5 = new LayerType("SHAPE", 4);
            LayerType layerType6 = new LayerType("TEXT", 5);
            LayerType layerType7 = new LayerType("UNKNOWN", 6);
            f23469d = layerType7;
            f23470e = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public LayerType() {
            throw null;
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) f23470e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MatteType f23471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MatteType f23472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MatteType[] f23473d;

        static {
            MatteType matteType = new MatteType("NONE", 0);
            f23471b = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            MatteType matteType3 = new MatteType("INVERT", 2);
            f23472c = matteType3;
            f23473d = new MatteType[]{matteType, matteType2, matteType3, new MatteType("LUMA", 3), new MatteType("LUMA_INVERTED", 4), new MatteType("UNKNOWN", 5)};
        }

        public MatteType() {
            throw null;
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) f23473d.clone();
        }
    }

    public Layer(List<p164n3.b> list, p079g3.b bVar, String str, long j, LayerType layerType, long j10, String str2, List<Mask> list2, j jVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, i iVar, androidx.compose.ui.autofill.a aVar, List<p225s3.a<Float>> list3, MatteType matteType, p154m3.b bVar2, boolean z10, t tVar, C2766j c2766j) {
        this.f23444a = list;
        this.f23445b = bVar;
        this.f23446c = str;
        this.f23447d = j;
        this.f23448e = layerType;
        this.f23449f = j10;
        this.f23450g = str2;
        this.f23451h = list2;
        this.f23452i = jVar;
        this.j = i10;
        this.f23453k = i11;
        this.f23454l = i12;
        this.f23455m = f10;
        this.f23456n = f11;
        this.f23457o = f12;
        this.f23458p = f13;
        this.f23459q = iVar;
        this.f23460r = aVar;
        this.f23462t = list3;
        this.f23463u = matteType;
        this.f23461s = bVar2;
        this.f23464v = z10;
        this.f23465w = tVar;
        this.f23466x = c2766j;
    }

    public final String a(String str) {
        int i10;
        StringBuilder sbE = C4.b.e(str);
        sbE.append(this.f23446c);
        sbE.append("\n");
        p079g3.b bVar = this.f23445b;
        Layer layerB = bVar.f35558g.b(this.f23449f);
        if (layerB != null) {
            sbE.append("\t\tParents: ");
            sbE.append(layerB.f23446c);
            for (Layer layerB2 = bVar.f35558g.b(layerB.f23449f); layerB2 != null; layerB2 = bVar.f35558g.b(layerB2.f23449f)) {
                sbE.append("->");
                sbE.append(layerB2.f23446c);
            }
            sbE.append(str);
            sbE.append("\n");
        }
        List<Mask> list = this.f23451h;
        if (!list.isEmpty()) {
            sbE.append(str);
            sbE.append("\tMasks: ");
            sbE.append(list.size());
            sbE.append("\n");
        }
        int i11 = this.j;
        if (i11 != 0 && (i10 = this.f23453k) != 0) {
            sbE.append(str);
            sbE.append("\tBackground: ");
            sbE.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f23454l)));
        }
        List<p164n3.b> list2 = this.f23444a;
        if (!list2.isEmpty()) {
            sbE.append(str);
            sbE.append("\tShapes:\n");
            for (p164n3.b bVar2 : list2) {
                sbE.append(str);
                sbE.append("\t\t");
                sbE.append(bVar2);
                sbE.append("\n");
            }
        }
        return sbE.toString();
    }

    public final String toString() {
        return a("");
    }
}
