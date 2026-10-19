package com.voltasit.obdeleven.presentation.garage;

import G8.H;
import K8.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel$loadVehicles$1", f = "GarageViewModel.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "invokeSuspend")
final class GarageViewModel$loadVehicles$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $loadedItemCount;
    final /* synthetic */ int $page;
    int label;
    final /* synthetic */ GarageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarageViewModel$loadVehicles$1(GarageViewModel garageViewModel, int i10, int i11, kotlin.coroutines.c<? super GarageViewModel$loadVehicles$1> cVar) {
        super(2, cVar);
        this.this$0 = garageViewModel;
        this.$page = i10;
        this.$loadedItemCount = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GarageViewModel$loadVehicles$1(this.this$0, this.$page, this.$loadedItemCount, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GarageViewModel$loadVehicles$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32338o.e("GarageViewModel", A8.f.d(this.$page * 50, this.$loadedItemCount, "Loading vehicles. Offset: ", ", limit: 50. Item count in adapter: "));
            Boolean boolD = this.this$0.f32335b0.d();
            boolean zBooleanValue = boolD == null ? false : boolD.booleanValue();
            if (this.$loadedItemCount % 50 != 0 && !zBooleanValue) {
                return p293xa.r.f47939a;
            }
            this.this$0.f32310C.j(Boolean.TRUE);
            this.this$0.f32312E.j(Boolean.FALSE);
            GarageViewModel garageViewModel = this.this$0;
            x xVar = garageViewModel.f32344u;
            int i11 = this.$page * 50;
            String str = garageViewModel.f32347x;
            this.label = 1;
            obj = xVar.l(i11, 50, str, this);
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
            this.this$0.f32338o.e("GarageViewModel", "Loaded items: " + ((List) bVar.f2463a).size());
            List<H> listD = this.this$0.f32348y.d();
            ArrayList arrayListP0 = listD != null ? kotlin.collections.q.p0(listD) : new ArrayList();
            boolean zIsEmpty = arrayListP0.isEmpty();
            T t8 = bVar.f2463a;
            if (zIsEmpty && ((List) t8).isEmpty() && this.this$0.f32347x.length() == 0) {
                GarageViewModel.d(this.this$0, com.voltasit.obdeleven.R.string.view_garage_no_vehicles);
            } else {
                this.this$0.f32314G.j(Boolean.TRUE);
                arrayListP0.addAll((Collection) t8);
                this.this$0.f32348y.j(arrayListP0);
            }
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32348y.j(EmptyList.f42983b);
            GarageViewModel.d(this.this$0, com.voltasit.obdeleven.R.string.common_check_network_try_again);
        }
        if (this.$page == 0) {
            this.this$0.f32331X.j(Boolean.TRUE);
        }
        U7.a<Boolean> aVar2 = this.this$0.f32335b0;
        Boolean bool = Boolean.FALSE;
        aVar2.j(bool);
        this.this$0.f32310C.j(bool);
        return p293xa.r.f47939a;
    }
}
