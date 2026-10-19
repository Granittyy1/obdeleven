package p163n2;

import Ia.l;
import kotlin.collections.i;
import kotlin.jvm.internal.Ref$BooleanRef;
import p141l2.C2749t;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f44775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f44776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f44777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f44778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f44779f;

    public /* synthetic */ h(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, j jVar, boolean z10, i iVar) {
        this.f44775b = ref$BooleanRef;
        this.f44776c = ref$BooleanRef2;
        this.f44777d = jVar;
        this.f44778e = z10;
        this.f44779f = iVar;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        C2749t entry = (C2749t) obj;
        kotlin.jvm.internal.i.e(entry, "entry");
        this.f44775b.element = true;
        this.f44776c.element = true;
        this.f44777d.q(entry, this.f44778e, this.f44779f);
        return r.f47939a;
    }
}
