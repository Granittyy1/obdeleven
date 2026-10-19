package retrofit2;

import kotlin.KotlinNothingValueException;
import kotlin.KotlinNullPointerException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.N;
import p131k5.W2;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinExtensions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class a<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2693i f46676a;

        public a(C2693i c2693i) {
            this.f46676a = c2693i;
        }

        @Override // retrofit2.f
        public final void onFailure(d<T> call, Throwable th) {
            kotlin.jvm.internal.i.e(call, "call");
            this.f46676a.resumeWith(kotlin.b.a(th));
        }

        @Override // retrofit2.f
        public final void onResponse(d<T> call, v<T> vVar) {
            kotlin.jvm.internal.i.e(call, "call");
            boolean zH = vVar.f46822a.h();
            C2693i c2693i = this.f46676a;
            if (!zH) {
                c2693i.resumeWith(kotlin.b.a(new HttpException(vVar)));
                return;
            }
            T t8 = vVar.f46823b;
            if (t8 != null) {
                c2693i.resumeWith(t8);
                return;
            }
            okhttp3.u uVarRequest = call.request();
            uVarRequest.getClass();
            Object objCast = l.class.cast(uVarRequest.f45665e.get(l.class));
            kotlin.jvm.internal.i.b(objCast);
            l lVar = (l) objCast;
            c2693i.resumeWith(kotlin.b.a(new KotlinNullPointerException("Response from " + lVar.f46705a.getName() + '.' + lVar.f46707c.getName() + " was null but response body type was declared as non-null")));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class b<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2693i f46677a;

        public b(C2693i c2693i) {
            this.f46677a = c2693i;
        }

        @Override // retrofit2.f
        public final void onFailure(d<T> call, Throwable th) {
            kotlin.jvm.internal.i.e(call, "call");
            this.f46677a.resumeWith(kotlin.b.a(th));
        }

        @Override // retrofit2.f
        public final void onResponse(d<T> call, v<T> vVar) {
            kotlin.jvm.internal.i.e(call, "call");
            boolean zH = vVar.f46822a.h();
            C2693i c2693i = this.f46677a;
            if (zH) {
                c2693i.resumeWith(vVar.f46823b);
            } else {
                c2693i.resumeWith(kotlin.b.a(new HttpException(vVar)));
            }
        }
    }

    public static final <T> Object a(final d<T> dVar, kotlin.coroutines.c<? super T> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: retrofit2.KotlinExtensions$await$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                dVar.cancel();
                return p293xa.r.f47939a;
            }
        });
        dVar.enqueue(new a(c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    public static final <T> Object b(final d<T> dVar, kotlin.coroutines.c<? super T> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: retrofit2.KotlinExtensions$await$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                dVar.cancel();
                return p293xa.r.f47939a;
            }
        });
        dVar.enqueue(new b(c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final void c(Throwable th, kotlin.coroutines.c cVar) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        int i10 = 1;
        if (cVar instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) cVar;
            int i11 = kotlinExtensions$suspendAndThrow$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(cVar);
            }
        } else {
            kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(cVar);
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = kotlinExtensions$suspendAndThrow$1.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        kotlinExtensions$suspendAndThrow$1.L$0 = th;
        kotlinExtensions$suspendAndThrow$1.label = 1;
        N.f43198a.Z0(kotlinExtensions$suspendAndThrow$1.getContext(), new W2(kotlinExtensions$suspendAndThrow$1, i10, th));
    }
}
