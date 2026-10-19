package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements g1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.coroutines.e] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.coroutines.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, androidx.compose.ui.platform.r0] */
    @Override // androidx.compose.ui.platform.g1
    public final Recomposer a(final View view) {
        kotlin.coroutines.e value;
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        ?? c1242r0;
        LinkedHashMap linkedHashMap = l1.f15061a;
        kotlin.coroutines.e eVar = EmptyCoroutineContext.f43032b;
        eVar.getClass();
        p293xa.g<kotlin.coroutines.e> gVar = AndroidUiDispatcher.f14804m;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            value = AndroidUiDispatcher.f14804m.getValue();
        } else {
            value = AndroidUiDispatcher.f14805n.get();
            if (value == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        kotlin.coroutines.e eVarPlus = value.plus(eVar);
        androidx.compose.runtime.O o10 = (androidx.compose.runtime.O) eVarPlus.get(androidx.compose.runtime.O.a.f12884b);
        if (o10 != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(o10);
            androidx.compose.runtime.L l10 = pausableMonotonicFrameClock2.f12887c;
            synchronized (l10.f12865a) {
                l10.f12868d = false;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        androidx.compose.ui.j jVar = (androidx.compose.ui.j) eVarPlus.get(androidx.compose.ui.j.a.f14152b);
        ?? r10 = jVar;
        if (jVar == null) {
            c1242r0 = new C1242r0();
            ref$ObjectRef.element = c1242r0;
        }
        if (pausableMonotonicFrameClock != null) {
            r10 = c1242r0;
            eVar = pausableMonotonicFrameClock;
        }
        r10 = c1242r0;
        kotlin.coroutines.e eVarPlus2 = eVarPlus.plus(eVar).plus(r10);
        final Recomposer recomposer = new Recomposer(eVarPlus2);
        synchronized (recomposer.f12892b) {
            recomposer.f12908s = true;
            p293xa.r rVar2 = p293xa.r.f47939a;
        }
        final kotlinx.coroutines.internal.f fVarA = kotlinx.coroutines.B.a(eVarPlus2);
        InterfaceC1376t interfaceC1376tG = P3.d.g(view);
        Lifecycle lifecycle = interfaceC1376tG != null ? interfaceC1376tG.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new j1(view, recomposer));
            lifecycle.a(new androidx.lifecycle.r() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                public /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f15006a;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f15006a = iArr;
                    }
                }

                @Override // androidx.lifecycle.r
                public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                    boolean z10;
                    int i10 = a.f15006a[event.ordinal()];
                    InterfaceC2691h<p293xa.r> interfaceC2691hX = null;
                    if (i10 == 1) {
                        C2680e.c(fVarA, null, CoroutineStart.f43169e, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ref$ObjectRef, recomposer, interfaceC1376t, this, view, null), 1);
                        return;
                    }
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return;
                            }
                            recomposer.v();
                            return;
                        } else {
                            Recomposer recomposer2 = recomposer;
                            synchronized (recomposer2.f12892b) {
                                recomposer2.f12908s = true;
                                p293xa.r rVar3 = p293xa.r.f47939a;
                            }
                            return;
                        }
                    }
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        androidx.compose.runtime.L l11 = pausableMonotonicFrameClock3.f12887c;
                        synchronized (l11.f12865a) {
                            try {
                                synchronized (l11.f12865a) {
                                    z10 = l11.f12868d;
                                }
                                if (!z10) {
                                    ArrayList arrayList = l11.f12866b;
                                    l11.f12866b = l11.f12867c;
                                    l11.f12867c = arrayList;
                                    l11.f12868d = true;
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((kotlin.coroutines.c) arrayList.get(i11)).resumeWith(p293xa.r.f47939a);
                                    }
                                    arrayList.clear();
                                    p293xa.r rVar4 = p293xa.r.f47939a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Recomposer recomposer3 = recomposer;
                    synchronized (recomposer3.f12892b) {
                        if (recomposer3.f12908s) {
                            recomposer3.f12908s = false;
                            interfaceC2691hX = recomposer3.x();
                        }
                    }
                    if (interfaceC2691hX != null) {
                        ((C2693i) interfaceC2691hX).resumeWith(p293xa.r.f47939a);
                    }
                }
            });
            return recomposer;
        }
        R.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
