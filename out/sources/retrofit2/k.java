package retrofit2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import okhttp3.InterfaceC2754e;

/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k<ResponseT, ReturnT> extends x<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f46698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2754e.a f46699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<okhttp3.A, ResponseT> f46700c;

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, ReturnT> f46701d;

        public a(u uVar, InterfaceC2754e.a aVar, h<okhttp3.A, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(uVar, aVar, hVar);
            this.f46701d = eVar;
        }

        @Override // retrofit2.k
        public final Object c(m mVar, Object[] objArr) {
            return this.f46701d.adapt(mVar);
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f46702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f46703e;

        public b(u uVar, InterfaceC2754e.a aVar, h hVar, e eVar, boolean z10) {
            super(uVar, aVar, hVar);
            this.f46702d = eVar;
            this.f46703e = z10;
        }

        @Override // retrofit2.k
        public final Object c(m mVar, Object[] objArr) {
            d<ResponseT> dVarAdapt = this.f46702d.adapt(mVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                if (!this.f46703e) {
                    return KotlinExtensions.a(dVarAdapt, cVar);
                }
                kotlin.jvm.internal.i.c(dVarAdapt, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return KotlinExtensions.b(dVarAdapt, cVar);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th) {
                KotlinExtensions.c(th, cVar);
                return CoroutineSingletons.f43038b;
            }
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f46704d;

        public c(u uVar, InterfaceC2754e.a aVar, h<okhttp3.A, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(uVar, aVar, hVar);
            this.f46704d = eVar;
        }

        @Override // retrofit2.k
        public final Object c(m mVar, Object[] objArr) {
            final d dVarAdapt = this.f46704d.adapt(mVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                C2693i c2693i = new C2693i(1, A8.p.y(cVar));
                c2693i.s();
                c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th) {
                        dVarAdapt.cancel();
                        return p293xa.r.f47939a;
                    }
                });
                p137kb.b bVar = new p137kb.b();
                bVar.f42919a = c2693i;
                dVarAdapt.enqueue(bVar);
                Object objP = c2693i.p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                return objP;
            } catch (Exception e10) {
                KotlinExtensions.c(e10, cVar);
                return CoroutineSingletons.f43038b;
            }
        }
    }

    public k(u uVar, InterfaceC2754e.a aVar, h<okhttp3.A, ResponseT> hVar) {
        this.f46698a = uVar;
        this.f46699b = aVar;
        this.f46700c = hVar;
    }

    @Override // retrofit2.x
    public final ReturnT a(Object obj, Object[] objArr) {
        return (ReturnT) c(new m(this.f46698a, obj, objArr, this.f46699b, this.f46700c), objArr);
    }

    public abstract Object c(m mVar, Object[] objArr);
}
