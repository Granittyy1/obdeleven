package coil.decode;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2683f0;
import kotlinx.coroutines.sync.SemaphoreImpl;
import me.zhanghai.android.materialprogressbar.R;
import p037cb.C1518c0;
import p318zb.C2839f;

/* JADX INFO: compiled from: BitmapFactoryDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapFactoryDecoder implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SemaphoreImpl f22852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExifOrientationPolicy f22853d;

    /* JADX INFO: compiled from: BitmapFactoryDecoder.kt */
    public static final class a extends p318zb.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception f22854c;

        @Override // p318zb.n, p318zb.H
        public final long l0(C2839f c2839f, long j) throws Exception {
            try {
                return super.l0(c2839f, j);
            } catch (Exception e10) {
                this.f22854c = e10;
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: BitmapFactoryDecoder.kt */
    public static final class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExifOrientationPolicy f22855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SemaphoreImpl f22856b;

        public b(int i10, ExifOrientationPolicy exifOrientationPolicy) {
            this.f22855a = exifOrientationPolicy;
            int i11 = kotlinx.coroutines.sync.d.f43604a;
            this.f22856b = new SemaphoreImpl(i10, 0);
        }

        @Override // coil.decode.d.a
        public final d create(coil.fetch.l lVar, coil.request.k kVar, coil.f fVar) {
            return new BitmapFactoryDecoder(lVar.f22989a, kVar, this.f22856b, this.f22855a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return b.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: coil.decode.BitmapFactoryDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: BitmapFactoryDecoder.kt */
    @Aa.c(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {231, R.styleable.AppCompatTheme_buttonStyle}, m = "decode")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BitmapFactoryDecoder.this.decode(this);
        }
    }

    public BitmapFactoryDecoder(x xVar, coil.request.k kVar, SemaphoreImpl semaphoreImpl, ExifOrientationPolicy exifOrientationPolicy) {
        this.f22850a = xVar;
        this.f22851b = kVar;
        this.f22852c = semaphoreImpl;
        this.f22853d = exifOrientationPolicy;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.decode.d
    public final Object decode(kotlin.coroutines.c<? super c> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.sync.c cVar2;
        BitmapFactoryDecoder bitmapFactoryDecoder;
        kotlinx.coroutines.sync.c cVar3;
        Throwable th;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1((ContinuationImpl) cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1((ContinuationImpl) cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                anonymousClass1.L$0 = this;
                cVar2 = this.f22852c;
                anonymousClass1.L$1 = cVar2;
                anonymousClass1.label = 1;
                if (cVar2.b(anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bitmapFactoryDecoder = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar3 = (kotlinx.coroutines.sync.c) anonymousClass1.L$0;
                    try {
                        kotlin.b.b(obj);
                        c cVar4 = (c) obj;
                        cVar3.a();
                        return cVar4;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar3.a();
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.c cVar5 = (kotlinx.coroutines.sync.c) anonymousClass1.L$1;
                bitmapFactoryDecoder = (BitmapFactoryDecoder) anonymousClass1.L$0;
                kotlin.b.b(obj);
                cVar2 = cVar5;
            }
            C1518c0 c1518c0 = new C1518c0(1, bitmapFactoryDecoder);
            anonymousClass1.L$0 = cVar2;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            Object objA = C2683f0.a(c1518c0, anonymousClass1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar3 = cVar2;
            obj = objA;
            c cVar6 = (c) obj;
            cVar3.a();
            return cVar6;
        } catch (Throwable th3) {
            cVar3 = cVar2;
            th = th3;
            cVar3.a();
            throw th;
        }
    }
}
