package androidx.paging;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: PagingData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PagingData<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f19286e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19287f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2686c<PageEvent<T>> f19288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f19289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f19290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.a<PageEvent.Insert<T>> f19291d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.paging.PagingData$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagingData.kt */
    public final class AnonymousClass1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AnonymousClass1 f19292h = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Ia.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: PagingData.kt */
    public static final class Companion {
        public static PagingData a(final List list) {
            return new PagingData(new kotlinx.coroutines.flow.f(new PageEvent.StaticList(list)), PagingData.f19286e, PagingData.f19287f, new Ia.a<PageEvent.Insert<T>>() { // from class: androidx.paging.PagingData$Companion$from$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Object invoke() {
                    PageEvent.Insert<Object> insert = PageEvent.Insert.f19259g;
                    return PageEvent.Insert.a.a(M1.k(new F(0, list)), 0, 0, n.f19375d, null);
                }
            });
        }
    }

    public /* synthetic */ PagingData(InterfaceC2686c interfaceC2686c, G g10, j jVar) {
        this(interfaceC2686c, g10, jVar, AnonymousClass1.f19292h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingData(InterfaceC2686c<? extends PageEvent<T>> interfaceC2686c, G uiReceiver, j hintReceiver, Ia.a<PageEvent.Insert<T>> cachedPageEvent) {
        kotlin.jvm.internal.i.e(uiReceiver, "uiReceiver");
        kotlin.jvm.internal.i.e(hintReceiver, "hintReceiver");
        kotlin.jvm.internal.i.e(cachedPageEvent, "cachedPageEvent");
        this.f19288a = interfaceC2686c;
        this.f19289b = uiReceiver;
        this.f19290c = hintReceiver;
        this.f19291d = cachedPageEvent;
    }

    /* JADX INFO: compiled from: PagingData.kt */
    public static final class b implements G {
        @Override // androidx.paging.G
        public final void a() {
        }

        @Override // androidx.paging.G
        public final void b() {
        }
    }

    /* JADX INFO: compiled from: PagingData.kt */
    public static final class a implements j {
        @Override // androidx.paging.j
        public final void a(I i10) {
        }
    }
}
