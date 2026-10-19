package com.voltasit.obdeleven.ui.dialogs.autocodeprogress;

import androidx.lifecycle.C;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.CouldNotSaveException;
import com.voltasit.obdeleven.domain.exceptions.SecurityAccessException;
import com.voltasit.obdeleven.domain.models.AccessAuthorizationType;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.usecases.sfd.e;
import com.voltasit.obdeleven.domain.usecases.sfd.j;
import com.voltasit.obdeleven.models.AutocodingState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p109i8.h;

/* JADX INFO: compiled from: AutocodeProgressViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f33893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f33894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.a f33895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f33896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.gateway.a f33897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U7.a<Short> f33898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U7.a f33899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C<List<Q8.a>> f33900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f33901i;
    public final C<AutocodingState> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f33902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33904m;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends h> gatewayControlUnits, e eVar, com.voltasit.obdeleven.domain.usecases.sfd.a aVar, j jVar, com.voltasit.obdeleven.domain.usecases.gateway.a aVar2) {
        i.e(gatewayControlUnits, "gatewayControlUnits");
        this.f33893a = gatewayControlUnits;
        this.f33894b = eVar;
        this.f33895c = aVar;
        this.f33896d = jVar;
        this.f33897e = aVar2;
        U7.a<Short> aVar3 = new U7.a<>();
        this.f33898f = aVar3;
        this.f33899g = aVar3;
        C<List<Q8.a>> c10 = new C<>();
        this.f33900h = c10;
        this.f33901i = c10;
        C<AutocodingState> c11 = new C<>();
        this.j = c11;
        this.f33902k = c11;
        Collections.sort(gatewayControlUnits, new com.obdeleven.service.util.a(0));
        ArrayList arrayList = new ArrayList();
        Iterator it = gatewayControlUnits.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AutocodingState autocodingState = AutocodingState.f31121b;
            if (!zHasNext) {
                this.f33900h.j(arrayList);
                this.j.j(autocodingState);
                return;
            } else {
                h hVar = (h) it.next();
                Q8.a aVar4 = new Q8.a();
                aVar4.f5126b = hVar;
                aVar4.f5125a = autocodingState;
                arrayList.add(aVar4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(b bVar, Q8.a aVar, ContinuationImpl continuationImpl) throws Throwable {
        AutocodeProgressViewModel$doAutoCode$1 autocodeProgressViewModel$doAutoCode$1;
        Object objC;
        bVar.getClass();
        if (continuationImpl instanceof AutocodeProgressViewModel$doAutoCode$1) {
            autocodeProgressViewModel$doAutoCode$1 = (AutocodeProgressViewModel$doAutoCode$1) continuationImpl;
            int i10 = autocodeProgressViewModel$doAutoCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                autocodeProgressViewModel$doAutoCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                autocodeProgressViewModel$doAutoCode$1 = new AutocodeProgressViewModel$doAutoCode$1(bVar, continuationImpl);
            }
        } else {
            autocodeProgressViewModel$doAutoCode$1 = new AutocodeProgressViewModel$doAutoCode$1(bVar, continuationImpl);
        }
        Object objA = autocodeProgressViewModel$doAutoCode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = autocodeProgressViewModel$doAutoCode$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = (Q8.a) autocodeProgressViewModel$doAutoCode$1.L$1;
                bVar = (b) autocodeProgressViewModel$doAutoCode$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return objA;
        }
        kotlin.b.b(objA);
        autocodeProgressViewModel$doAutoCode$1.L$0 = bVar;
        autocodeProgressViewModel$doAutoCode$1.L$1 = aVar;
        autocodeProgressViewModel$doAutoCode$1.label = 1;
        objA = bVar.f33897e.a(aVar, autocodeProgressViewModel$doAutoCode$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) objA;
        boolean z10 = aVar2 instanceof C8.a.b;
        AutocodingState autocodingState = AutocodingState.f31123d;
        if (z10) {
            aVar.f5125a = autocodingState;
            return Boolean.FALSE;
        }
        if (!(aVar2 instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th = ((C8.a.C0024a) aVar2).f2462a;
        autocodeProgressViewModel$doAutoCode$1.L$0 = null;
        autocodeProgressViewModel$doAutoCode$1.L$1 = null;
        autocodeProgressViewModel$doAutoCode$1.label = 2;
        bVar.getClass();
        if (th instanceof SecurityAccessException) {
            objC = bVar.c(aVar, autocodeProgressViewModel$doAutoCode$1);
        } else {
            if (th instanceof CouldNotSaveException) {
                aVar.f5125a = autocodingState;
                bVar.f33904m = true;
            } else {
                aVar.f5125a = AutocodingState.f31124e;
            }
            objC = Boolean.FALSE;
        }
        objA = objC;
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Q8.a aVar, ContinuationImpl continuationImpl) throws Throwable {
        AutocodeProgressViewModel$handleSecurity$1 autocodeProgressViewModel$handleSecurity$1;
        Q8.a aVar2;
        h hVar;
        b bVar;
        if (continuationImpl instanceof AutocodeProgressViewModel$handleSecurity$1) {
            autocodeProgressViewModel$handleSecurity$1 = (AutocodeProgressViewModel$handleSecurity$1) continuationImpl;
            int i10 = autocodeProgressViewModel$handleSecurity$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                autocodeProgressViewModel$handleSecurity$1.label = i10 - Integer.MIN_VALUE;
            } else {
                autocodeProgressViewModel$handleSecurity$1 = new AutocodeProgressViewModel$handleSecurity$1(this, continuationImpl);
            }
        } else {
            autocodeProgressViewModel$handleSecurity$1 = new AutocodeProgressViewModel$handleSecurity$1(this, continuationImpl);
        }
        AutocodeProgressViewModel$handleSecurity$1 autocodeProgressViewModel$handleSecurity$2 = autocodeProgressViewModel$handleSecurity$1;
        Object objD = autocodeProgressViewModel$handleSecurity$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = autocodeProgressViewModel$handleSecurity$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                hVar = (h) autocodeProgressViewModel$handleSecurity$2.L$2;
                Q8.a aVar3 = (Q8.a) autocodeProgressViewModel$handleSecurity$2.L$1;
                b bVar2 = (b) autocodeProgressViewModel$handleSecurity$2.L$0;
                kotlin.b.b(objD);
                aVar2 = aVar3;
                bVar = bVar2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objD);
            }
        }
        kotlin.b.b(objD);
        h hVar2 = aVar.f5126b;
        short sShortValue = hVar2.n().shortValue();
        Feature feature = Feature.LongCoding;
        autocodeProgressViewModel$handleSecurity$2.L$0 = this;
        autocodeProgressViewModel$handleSecurity$2.L$1 = aVar;
        autocodeProgressViewModel$handleSecurity$2.L$2 = hVar2;
        autocodeProgressViewModel$handleSecurity$2.label = 1;
        Object objA = this.f33895c.a(sShortValue, feature, autocodeProgressViewModel$handleSecurity$2);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = aVar;
        hVar = hVar2;
        objD = objA;
        bVar = this;
        C8.a aVar4 = (C8.a) objD;
        if (aVar4 instanceof C8.a.C0024a) {
            aVar2.f5125a = AutocodingState.f31124e;
            return Boolean.FALSE;
        }
        if (!(aVar4 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String objectId = hVar.d().getControlUnitBase().getObjectId();
        i.d(objectId, "getObjectId(...)");
        short sShortValue2 = hVar.n().shortValue();
        AccessAuthorizationType accessAuthorizationType = (AccessAuthorizationType) ((C8.a.b) aVar4).f2463a;
        autocodeProgressViewModel$handleSecurity$2.L$0 = null;
        autocodeProgressViewModel$handleSecurity$2.L$1 = null;
        autocodeProgressViewModel$handleSecurity$2.L$2 = null;
        autocodeProgressViewModel$handleSecurity$2.label = 2;
        objD = bVar.d(objectId, sShortValue2, accessAuthorizationType, aVar2, autocodeProgressViewModel$handleSecurity$2);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, short s10, AccessAuthorizationType accessAuthorizationType, Q8.a aVar, ContinuationImpl continuationImpl) {
        AutocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1 autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1;
        b bVar;
        if (continuationImpl instanceof AutocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1) {
            autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1 = (AutocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1) continuationImpl;
            int i10 = autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.label = i10 - Integer.MIN_VALUE;
            } else {
                autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1 = new AutocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1(this, continuationImpl);
            }
        } else {
            autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1 = new AutocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1(this, continuationImpl);
        }
        Object objA = autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.label;
        AutocodingState autocodingState = AutocodingState.f31124e;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.S$0;
                aVar = (Q8.a) autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$2;
                str = (String) autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$1;
                bVar = (b) autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        if (accessAuthorizationType != AccessAuthorizationType.f30440c) {
            aVar.f5125a = autocodingState;
            return Boolean.FALSE;
        }
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$0 = this;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$1 = str;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$2 = aVar;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.S$0 = s10;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.label = 1;
        objA = this.f33894b.a(autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        bVar = this;
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            aVar.f5125a = autocodingState;
            return Boolean.FALSE;
        }
        if ((aVar2 instanceof C8.a.b) && !((Boolean) ((C8.a.b) aVar2).f2463a).booleanValue()) {
            bVar.f33898f.j(new Short(s10));
            aVar.f5125a = AutocodingState.f31121b;
            return Boolean.TRUE;
        }
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$0 = null;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$1 = null;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.L$2 = null;
        autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1.label = 2;
        objA = bVar.f(str, s10, aVar, autocodeProgressViewModel$onSecurityAccessAuthorizationTypeResult$1);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }

    public final void e() {
        C2680e.c(Z.a(this), null, null, new AutocodeProgressViewModel$startAutocode$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, short s10, Q8.a aVar, ContinuationImpl continuationImpl) {
        AutocodeProgressViewModel$unlockSfd$1 autocodeProgressViewModel$unlockSfd$1;
        b bVar;
        if (continuationImpl instanceof AutocodeProgressViewModel$unlockSfd$1) {
            autocodeProgressViewModel$unlockSfd$1 = (AutocodeProgressViewModel$unlockSfd$1) continuationImpl;
            int i10 = autocodeProgressViewModel$unlockSfd$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                autocodeProgressViewModel$unlockSfd$1.label = i10 - Integer.MIN_VALUE;
            } else {
                autocodeProgressViewModel$unlockSfd$1 = new AutocodeProgressViewModel$unlockSfd$1(this, continuationImpl);
            }
        } else {
            autocodeProgressViewModel$unlockSfd$1 = new AutocodeProgressViewModel$unlockSfd$1(this, continuationImpl);
        }
        Object objA = autocodeProgressViewModel$unlockSfd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = autocodeProgressViewModel$unlockSfd$1.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.b.b(objA);
            Feature feature = Feature.LongCoding;
            autocodeProgressViewModel$unlockSfd$1.L$0 = this;
            autocodeProgressViewModel$unlockSfd$1.L$1 = aVar;
            autocodeProgressViewModel$unlockSfd$1.label = 1;
            objA = this.f33896d.a(str, s10, feature, autocodeProgressViewModel$unlockSfd$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Q8.a) autocodeProgressViewModel$unlockSfd$1.L$1;
            bVar = (b) autocodeProgressViewModel$unlockSfd$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar2 = (C8.a) objA;
        boolean z11 = aVar2 instanceof C8.a.C0024a;
        AutocodingState autocodingState = AutocodingState.f31124e;
        boolean z12 = false;
        if (z11) {
            aVar.f5125a = autocodingState;
        } else {
            if (!(aVar2 instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((Boolean) ((C8.a.b) aVar2).f2463a).booleanValue()) {
                bVar.e();
            } else {
                bVar.getClass();
                aVar.f5125a = autocodingState;
                z10 = false;
            }
            z12 = z10;
        }
        return Boolean.valueOf(z12);
    }
}
