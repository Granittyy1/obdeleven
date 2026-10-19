package com.voltasit.obdeleven.presentation;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.C;
import androidx.lifecycle.Y;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlinx.coroutines.InterfaceC2713x;
import p293xa.r;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f32112a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C<PreloaderState> f32113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f32114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U7.a<Boolean> f32115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U7.a f32116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U7.a<r> f32117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U7.a f32118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U7.a<Integer> f32119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U7.a f32120i;
    public final U7.a<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U7.a f32121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final U7.a<Integer> f32122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U7.a f32123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1085f0 f32124n;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class a extends kotlin.coroutines.a implements InterfaceC2713x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f32125b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(d dVar) {
            InterfaceC2713x.a aVar = InterfaceC2713x.a.f43616b;
            this.f32125b = dVar;
            super(aVar);
        }

        @Override // kotlinx.coroutines.InterfaceC2713x
        public final void handleException(kotlin.coroutines.e eVar, Throwable th) {
            d dVar = this.f32125b;
            dVar.f32113b.j(PreloaderState.d.f32643a);
            dVar.f32124n.setValue(Boolean.FALSE);
            O.e.m(th);
            if (th instanceof VehicleNotConnectedException) {
                return;
            }
            p252u6.e.a().b(th);
        }
    }

    public d() {
        C<PreloaderState> c10 = new C<>();
        this.f32113b = c10;
        this.f32114c = c10;
        U7.a<Boolean> aVar = new U7.a<>();
        this.f32115d = aVar;
        this.f32116e = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f32117f = aVar2;
        this.f32118g = aVar2;
        U7.a<Integer> aVar3 = new U7.a<>();
        this.f32119h = aVar3;
        this.f32120i = aVar3;
        U7.a<String> aVar4 = new U7.a<>();
        this.j = aVar4;
        this.f32121k = aVar4;
        U7.a<Integer> aVar5 = new U7.a<>();
        this.f32122l = aVar5;
        this.f32123m = aVar5;
        this.f32124n = J0.f(Boolean.FALSE);
    }
}
