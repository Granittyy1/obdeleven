package coil;

import coil.fetch.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.q;

/* JADX INFO: compiled from: ComponentRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<coil.intercept.c> f22698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Pair<W2.d<? extends Object, ? extends Object>, Class<? extends Object>>> f22699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Pair<V2.b<? extends Object>, Class<? extends Object>>> f22700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Pair<h.a<? extends Object>, Class<? extends Object>>> f22701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<coil.decode.d.a> f22702e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends coil.intercept.c> list, List<? extends Pair<? extends W2.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends V2.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends coil.decode.d.a> list5) {
        this.f22698a = list;
        this.f22699b = list2;
        this.f22700c = list3;
        this.f22701d = list4;
        this.f22702e = list5;
    }

    /* JADX INFO: renamed from: coil.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComponentRegistry.kt */
    public static final class C0238a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f22703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f22704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f22705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f22706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f22707e;

        public C0238a() {
            this.f22703a = new ArrayList();
            this.f22704b = new ArrayList();
            this.f22705c = new ArrayList();
            this.f22706d = new ArrayList();
            this.f22707e = new ArrayList();
        }

        public final void a(W2.d dVar, Class cls) {
            this.f22704b.add(new Pair(dVar, cls));
        }

        public final void b(h.a aVar, Class cls) {
            this.f22706d.add(new Pair(aVar, cls));
        }

        public final a c() {
            return new a(coil.util.b.a(this.f22703a), coil.util.b.a(this.f22704b), coil.util.b.a(this.f22705c), coil.util.b.a(this.f22706d), coil.util.b.a(this.f22707e));
        }

        public C0238a(a aVar) {
            this.f22703a = q.p0(aVar.f22698a);
            this.f22704b = q.p0(aVar.f22699b);
            this.f22705c = q.p0(aVar.f22700c);
            this.f22706d = q.p0(aVar.f22701d);
            this.f22707e = q.p0(aVar.f22702e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        EmptyList emptyList = EmptyList.f42983b;
        this(emptyList, emptyList, emptyList, emptyList, emptyList);
    }
}
