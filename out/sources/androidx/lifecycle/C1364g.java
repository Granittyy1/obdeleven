package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1364g implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1363f f17818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f17819c;

    /* JADX INFO: renamed from: androidx.lifecycle.g$a */
    /* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17820a;

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
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f17820a = iArr;
        }
    }

    public C1364g(InterfaceC1363f defaultLifecycleObserver, r rVar) {
        kotlin.jvm.internal.i.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f17818b = defaultLifecycleObserver;
        this.f17819c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        int i10 = a.f17820a[event.ordinal()];
        InterfaceC1363f interfaceC1363f = this.f17818b;
        switch (i10) {
            case 1:
                interfaceC1363f.getClass();
                break;
            case 2:
                interfaceC1363f.x(interfaceC1376t);
                break;
            case 3:
                interfaceC1363f.c(interfaceC1376t);
                break;
            case 4:
                interfaceC1363f.getClass();
                break;
            case 5:
                interfaceC1363f.p(interfaceC1376t);
                break;
            case 6:
                interfaceC1363f.s(interfaceC1376t);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        r rVar = this.f17819c;
        if (rVar != null) {
            rVar.h(interfaceC1376t, event);
        }
    }
}
