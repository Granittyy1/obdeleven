package com.voltasit.obdeleven.presentation.controlUnit.info;

import G8.s;
import Ia.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoViewModel$clickItem$1", f = "ControlUnitInfoViewModel.kt", l = {242}, m = "invokeSuspend")
final class ControlUnitInfoViewModel$clickItem$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ h $infoItem;
    final /* synthetic */ String $odxName;
    final /* synthetic */ String $odxVersion;
    final /* synthetic */ String $platform;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitInfoViewModel$clickItem$1(c cVar, String str, String str2, String str3, h hVar, kotlin.coroutines.c<? super ControlUnitInfoViewModel$clickItem$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
        this.$odxName = str;
        this.$odxVersion = str2;
        this.$platform = str3;
        this.$infoItem = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitInfoViewModel$clickItem$1(this.this$0, this.$odxName, this.$odxVersion, this.$platform, this.$infoItem, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ControlUnitInfoViewModel$clickItem$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            com.voltasit.obdeleven.domain.usecases.odx.i iVar = this.this$0.f31631o;
            String str = this.$odxName;
            String str2 = this.$odxVersion;
            String str3 = this.$platform;
            this.label = 1;
            obj = iVar.a(str, str2, str3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            C8.a.b bVar = (C8.a.b) aVar;
            if (((List) bVar.f2463a).isEmpty()) {
                c cVar = this.this$0;
                cVar.j.j(cVar.f31632p.a(R.string.no_data_found, new Object[0]));
            } else {
                c cVar2 = this.this$0;
                String strA = cVar2.f31632p.a(R.string.common_odx_file, new Object[0]);
                h hVarC = cVar2.c(strA);
                Iterable iterable = (Iterable) bVar.f2463a;
                ArrayList arrayList = new ArrayList(m.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s) it.next()).f3538c);
                }
                cVar2.e(strA, h.a(hVarC, null, arrayList, 15));
                this.this$0.f31640x.j(this.$infoItem);
            }
        } else {
            boolean z10 = aVar instanceof C8.a.C0024a;
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
