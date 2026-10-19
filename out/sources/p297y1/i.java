package p297y1;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.common.base.Suppliers;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p078g1.C;
import p078g1.D;
import p078g1.F;
import p078g1.h;
import p078g1.n;
import p078g1.w;
import p114j1.A;
import p114j1.g;
import p114j1.l;
import p114j1.s;
import p114j1.t;
import p114j1.u;
import p114j1.v;

/* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p297y1.b f48117t = new p297y1.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v<Long> f48119b = new v<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f48120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<c> f48121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Object> f48122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C.a f48123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p297y1.d f48124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f48125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<d> f48126i;
    public g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Pair<Surface, s> f48127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0.a f48130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f48132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f48133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48135s;

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f48136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f48137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f48138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f48139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<Object> f48140e = ImmutableList.K();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C.a f48141f = C.f35227a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public t f48142g = p114j1.c.f41011a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f48143h;

        public a(Context context, o oVar) {
            this.f48136a = context.getApplicationContext();
            this.f48137b = oVar;
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public final class b implements y {
        public b() {
        }

        @Override // p297y1.y
        public final void a() {
            Iterator<d> it = i.this.f48126i.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // p297y1.y
        public final void b(F f10) {
            Iterator<d> it = i.this.f48126i.iterator();
            while (it.hasNext()) {
                it.next().b(f10);
            }
        }

        @Override // p297y1.y
        public final void c() {
            Iterator<d> it = i.this.f48126i.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList<Object> f48146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f48147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f48148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f48149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public y f48150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Executor f48151g;

        public c(Context context) {
            this.f48145a = A.D(context) ? 1 : 5;
            this.f48146b = ImmutableList.K();
            this.f48149e = -9223372036854775807L;
            this.f48150f = y.f48226a;
            this.f48151g = i.f48117t;
        }

        @Override // y1.i.d
        public final void a() {
            final y yVar = this.f48150f;
            this.f48151g.execute(new Runnable() { // from class: y1.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48158b.getClass();
                    yVar.a();
                }
            });
        }

        @Override // y1.i.d
        public final void b(final F f10) {
            final y yVar = this.f48150f;
            this.f48151g.execute(new Runnable() { // from class: y1.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48155b.getClass();
                    yVar.b(f10);
                }
            });
        }

        @Override // y1.i.d
        public final void c() {
            this.f48151g.execute(new com.voltasit.obdeleven.presentation.vehicle.b(this, 1, this.f48150f));
        }

        public final void d(boolean z10) {
            v<Long> vVar;
            if (f()) {
                throw null;
            }
            this.f48149e = -9223372036854775807L;
            i iVar = i.this;
            if (iVar.f48129m == 1) {
                iVar.f48128l++;
                p297y1.d dVar = iVar.f48124g;
                if (z10) {
                    o oVar = dVar.f48026a;
                    q qVar = oVar.f48161b;
                    qVar.f48186m = 0L;
                    qVar.f48189p = -1L;
                    qVar.f48187n = -1L;
                    oVar.f48167h = -9223372036854775807L;
                    oVar.f48165f = -9223372036854775807L;
                    oVar.d(1);
                    oVar.f48168i = -9223372036854775807L;
                }
                r rVar = dVar.f48028c;
                l lVar = rVar.f48203f;
                lVar.f41037a = 0;
                lVar.f41038b = 0;
                rVar.f48204g = -9223372036854775807L;
                rVar.f48205h = -9223372036854775807L;
                rVar.f48206i = -9223372036854775807L;
                v<Long> vVar2 = rVar.f48202e;
                if (vVar2.h() > 0) {
                    p241t7.b.e(vVar2.h() > 0);
                    while (vVar2.h() > 1) {
                        vVar2.e();
                    }
                    Long lE = vVar2.e();
                    lE.getClass();
                    vVar2.a(lE, 0L);
                }
                v<F> vVar3 = rVar.f48201d;
                if (vVar3.h() > 0) {
                    p241t7.b.e(vVar3.h() > 0);
                    while (vVar3.h() > 1) {
                        vVar3.e();
                    }
                    F fE = vVar3.e();
                    fE.getClass();
                    vVar3.a(fE, 0L);
                }
                dVar.f48029d.clear();
                while (true) {
                    vVar = iVar.f48119b;
                    if (vVar.h() <= 1) {
                        break;
                    } else {
                        vVar.e();
                    }
                }
                if (vVar.h() == 1) {
                    Long lE2 = vVar.e();
                    lE2.getClass();
                    dVar.b(lE2.longValue(), iVar.f48133q);
                }
                iVar.f48131o = -9223372036854775807L;
                iVar.f48132p = false;
                g gVar = iVar.j;
                p241t7.b.l(gVar);
                gVar.e(new androidx.lifecycle.F(2, iVar));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [y1.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final boolean e(n nVar) throws VideoSink$VideoSinkException {
            p241t7.b.k(!f());
            i iVar = i.this;
            p241t7.b.k(iVar.f48129m == 0);
            h hVar = nVar.f35277B;
            if (hVar == null || !hVar.d()) {
                hVar = h.f35253h;
            }
            h hVar2 = (hVar.f35256c != 7 || A.f40996a >= 34) ? hVar : new h(hVar.f35254a, hVar.f35255b, 6, hVar.f35258e, hVar.f35259f, hVar.f35257d);
            Looper looperMyLooper = Looper.myLooper();
            p241t7.b.l(looperMyLooper);
            final u uVarA = iVar.f48125h.a(looperMyLooper, null);
            iVar.j = uVarA;
            try {
                iVar.f48120c.a(iVar.f48118a, hVar2, iVar, new Executor() { // from class: y1.h
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        uVarA.e(runnable);
                    }
                }, iVar.f48123f, iVar.f48122e).b();
                Pair<Surface, s> pair = iVar.f48127k;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    s sVar = (s) pair.second;
                    iVar.a(surface, sVar.f41066a, sVar.f41067b);
                }
                iVar.f48124g.getClass();
                iVar.f48129m = 1;
                throw null;
            } catch (VideoFrameProcessingException e10) {
                throw new VideoSink$VideoSinkException(e10, nVar);
            }
        }

        public final boolean f() {
            return false;
        }

        public final void g(n nVar) {
            n.a aVarA = nVar.a();
            h hVar = nVar.f35277B;
            if (hVar == null || !hVar.d()) {
                hVar = h.f35253h;
            }
            aVarA.f35315A = hVar;
            aVarA.a();
            p241t7.b.l(null);
            throw null;
        }

        public final void h(int i10) {
            q qVar = i.this.f48124g.f48026a.f48161b;
            if (qVar.j == i10) {
                return;
            }
            qVar.j = i10;
            qVar.d(true);
        }

        public final void i(Surface surface, s sVar) {
            i iVar = i.this;
            Pair<Surface, s> pair = iVar.f48127k;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((s) iVar.f48127k.second).equals(sVar)) {
                return;
            }
            iVar.f48127k = Pair.create(surface, sVar);
            iVar.a(surface, sVar.f41066a, sVar.f41067b);
        }

        public final void j(List<Object> list) {
            i iVar = i.this;
            iVar.f48120c.getClass();
            ImmutableList.a aVar = new ImmutableList.a();
            aVar.f(list);
            aVar.f(iVar.f48122e);
            this.f48146b = aVar.h();
        }

        public final void k(float f10) {
            i.this.f48124g.f48026a.h(f10);
        }

        public final void l(long j, long j10) {
            i iVar = i.this;
            v<Long> vVar = iVar.f48119b;
            long j11 = this.f48149e;
            vVar.a(Long.valueOf(j), j11 == -9223372036854775807L ? 0L : j11 + 1);
            this.f48148d = j10;
            iVar.f48133q = j10;
            iVar.f48124g.b(0L, j10);
        }

        public final void m(List<Object> list) {
            if (this.f48146b.equals(list)) {
                return;
            }
            j(list);
            n nVar = this.f48147c;
            if (nVar != null) {
                g(nVar);
            }
        }

        public final void n(n nVar) {
            i.this.f48124g.j = nVar;
        }

        public final void o() {
            long j = this.f48149e;
            i iVar = i.this;
            if (iVar.f48131o >= j) {
                r rVar = iVar.f48124g.f48028c;
                rVar.f48206i = rVar.f48204g;
                iVar.f48132p = true;
            }
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public interface d {
        void a();

        void b(F f10);

        void c();
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public static final class e implements D.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j<D.a> f48153a = Suppliers.a(new l());
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public static final class f implements w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f48154a;

        public f(e eVar) {
            this.f48154a = eVar;
        }

        @Override // g1.w.a
        public final w a(Context context, h hVar, i iVar, h hVar2, C.a aVar, List list) throws VideoFrameProcessingException {
            try {
                return ((w.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(D.a.class).newInstance(this.f48154a)).a(context, hVar, iVar, hVar2, aVar, list);
            } catch (Exception e10) {
                int i10 = VideoFrameProcessingException.f17864b;
                if (e10 instanceof VideoFrameProcessingException) {
                    throw ((VideoFrameProcessingException) e10);
                }
                throw new VideoFrameProcessingException(e10);
            }
        }
    }

    public i(a aVar) {
        this.f48118a = aVar.f48136a;
        f fVar = aVar.f48139d;
        p241t7.b.l(fVar);
        this.f48120c = fVar;
        this.f48121d = new SparseArray<>();
        this.f48122e = aVar.f48140e;
        this.f48123f = aVar.f48141f;
        t tVar = aVar.f48142g;
        this.f48125h = tVar;
        this.f48124g = new p297y1.d(aVar.f48137b, tVar);
        this.f48126i = new CopyOnWriteArraySet<>();
        new n.a().a();
        this.f48131o = -9223372036854775807L;
        this.f48134r = -1;
        this.f48129m = 0;
    }

    public final void a(Surface surface, int i10, int i11) {
    }
}
