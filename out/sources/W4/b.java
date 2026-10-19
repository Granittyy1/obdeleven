package W4;

import T4.InterfaceC0777j;
import U4.C0807o;
import Z2.f;
import android.os.Parcel;
import androidx.compose.foundation.gestures.snapping.j;
import androidx.compose.foundation.lazy.layout.P;
import coil.compose.AsyncImagePainter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements InterfaceC0777j, j, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7001b;

    public /* synthetic */ b(Object obj) {
        this.f7001b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T4.InterfaceC0777j
    public void b(Object obj, Object obj2) {
        h hVar = (h) obj2;
        com.google.android.gms.common.api.a aVar = d.f7002i;
        a aVar2 = (a) ((e) obj).A();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar2.f34737d);
        int i10 = e5.c.f34738a;
        C0807o c0807o = (C0807o) this.f7001b;
        if (c0807o == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c0807o.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar2.f34736c.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // androidx.compose.foundation.gestures.snapping.j
    public float c(float f10, float f11) {
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.snapping.j
    public float d(float f10) {
        return ((androidx.compose.foundation.gestures.snapping.f) this.f7001b).d(f10);
    }

    @Override // Z2.f
    public Object e(kotlin.coroutines.c cVar) {
        final StateFlowImpl stateFlowImpl = ((AsyncImagePainter) this.f7001b).f22714h;
        return C2688e.j(new InterfaceC2686c<Z2.e>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements InterfaceC2687d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2687d f22735b;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Aa.c(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {221}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                    this.f22735b = interfaceC2687d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Z2.e eVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        kotlin.b.b(obj2);
                        long j = ((I.h) obj).f3769a;
                        if (j == 9205357640488583168L) {
                            eVar = Z2.e.f7731c;
                        } else {
                            Z2.c cVar2 = y.f22840b;
                            if (I.h.d(j) < 0.5d || I.h.b(j) < 0.5d) {
                                eVar = null;
                            } else {
                                float fD = I.h.d(j);
                                Z2.a c0110a = (Float.isInfinite(fD) || Float.isNaN(fD)) ? Z2.a.b.f7726a : new Z2.a.C0110a(Ka.a.b(I.h.d(j)));
                                float fB = I.h.b(j);
                                eVar = new Z2.e(c0110a, (Float.isInfinite(fB) || Float.isNaN(fB)) ? Z2.a.b.f7726a : new Z2.a.C0110a(Ka.a.b(I.h.b(j))));
                            }
                        }
                        if (eVar != null) {
                            anonymousClass1.label = 1;
                            if (this.f22735b.emit(eVar, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj2);
                    }
                    return p293xa.r.f47939a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2686c
            public final Object collect(InterfaceC2687d<? super Z2.e> interfaceC2687d, kotlin.coroutines.c cVar2) {
                Object objCollect = stateFlowImpl.collect(new AnonymousClass2(interfaceC2687d), cVar2);
                return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
            }
        }, (ContinuationImpl) cVar);
    }

    public boolean f(int i10) {
        if (i10 >= 0) {
            P p10 = (P) this.f7001b;
            if (i10 < p10.f10670b) {
            }
        }
        return false;
    }
}
