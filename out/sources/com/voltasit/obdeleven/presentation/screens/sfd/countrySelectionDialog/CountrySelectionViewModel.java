package com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog;

import Aa.c;
import G8.C0705g;
import Ia.p;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.o;
import com.voltasit.obdeleven.presentation.d;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: CountrySelectionViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CountrySelectionViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f33054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1085f0 f33055p = J0.f(EmptyList.f42983b);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1085f0 f33056q = J0.f("");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<C0705g> f33057r;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: CountrySelectionViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionViewModel$1", f = "CountrySelectionViewModel.kt", l = {25}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CountrySelectionViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                o oVar = CountrySelectionViewModel.this.f33054o;
                this.label = 1;
                obj = oVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            C8.a aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                CountrySelectionViewModel countrySelectionViewModel = CountrySelectionViewModel.this;
                List<C0705g> list = (List) ((C8.a.b) aVar).f2463a;
                countrySelectionViewModel.f33057r = list;
                if (list == null) {
                    i.m("allCountries");
                    throw null;
                }
                countrySelectionViewModel.f33055p.setValue(list);
            }
            return r.f47939a;
        }
    }

    public CountrySelectionViewModel(o oVar) {
        this.f33054o = oVar;
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }
}
