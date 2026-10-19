package com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet;

import J8.c;
import J8.p;
import Q8.b;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.device.h;
import com.voltasit.obdeleven.domain.usecases.device.i;
import com.voltasit.obdeleven.domain.usecases.device.j;
import com.voltasit.obdeleven.presentation.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DeviceSelectionViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceSelectionViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f33921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f33922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f33923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C<List<b>> f33924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C f33925s;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: DeviceSelectionViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionViewModel$2", f = "DeviceSelectionViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ List<b> $storedDevices;
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionViewModel$2$a */
        /* JADX INFO: compiled from: DeviceSelectionViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSelectionViewModel f33926b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<b> f33927c;

            public a(DeviceSelectionViewModel deviceSelectionViewModel, List<b> list) {
                this.f33926b = deviceSelectionViewModel;
                this.f33927c = list;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                DeviceSelectionViewModel deviceSelectionViewModel = this.f33926b;
                C<List<b>> c10 = deviceSelectionViewModel.f33924r;
                ArrayList<b> arrayListC0 = q.c0((List) obj, this.f33927c);
                deviceSelectionViewModel.f33923q.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (b bVar : arrayListC0) {
                    if (bVar.f5132g) {
                        arrayList.add(bVar);
                    } else {
                        arrayList2.add(bVar);
                    }
                }
                Iterator<T> it = q.h0(arrayList, new p020b7.c(1)).iterator();
                while (true) {
                    int i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    b bVar2 = (b) it.next();
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i10 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.i.a(((b) it2.next()).f5128c, bVar2.f5128c)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 == -1) {
                        arrayList3.add(bVar2);
                    }
                }
                for (b bVar3 : q.h0(arrayList2, new h())) {
                    Iterator it3 = arrayList3.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.i.a(((b) it3.next()).f5128c, bVar3.f5128c)) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 != -1) {
                        b bVar4 = (b) arrayList3.get(i11);
                        String str = bVar3.f5127b;
                        String str2 = bVar4.f5128c;
                        arrayList3.set(i11, new b(bVar4.f5130e, str, str2, bVar4.f5131f, bVar4.f5129d, bVar4.f5132g));
                    } else {
                        arrayList3.add(bVar3);
                    }
                }
                c10.j(arrayList3);
                return r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<b> list, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$storedDevices = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return DeviceSelectionViewModel.this.new AnonymousClass2(this.$storedDevices, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return r.f47939a;
            }
            kotlin.b.b(obj);
            StateFlowImpl stateFlowImplB = DeviceSelectionViewModel.this.f33921o.b();
            a aVar = new a(DeviceSelectionViewModel.this, this.$storedDevices);
            this.label = 1;
            stateFlowImplB.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    public DeviceSelectionViewModel(c cVar, p pVar, i iVar, j jVar) {
        this.f33921o = cVar;
        this.f33922p = pVar;
        this.f33923q = iVar;
        C<List<b>> c10 = new C<>();
        this.f33924r = c10;
        this.f33925s = c10;
        ArrayList arrayListA = b.a.a(jVar.f30784a.J());
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f5132g = false;
        }
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass2(arrayListA, null), 2);
    }

    public final void b() {
        this.f33922p.f("DeviceSelectionViewModel", "cancelScan()");
        this.f33921o.i();
    }
}
