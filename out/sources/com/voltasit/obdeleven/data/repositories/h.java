package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.domain.exceptions.InvalidPinException;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.network.NetworkException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p304y9.C2831j;
import p304y9.C2832k;

/* JADX INFO: compiled from: DeviceRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements K8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.network.c f30350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J8.p f30352d;

    public h(com.voltasit.sharednetwork.a aVar, com.voltasit.obdeleven.network.c cVar, A8.j jVar, F8.c cVar2, J8.p pVar) {
        this.f30349a = aVar;
        this.f30350b = cVar;
        this.f30351c = cVar2;
        this.f30352d = pVar;
    }

    public final C8.a.C0024a a(Throwable th) {
        return ((th instanceof NetworkException) && ((NetworkException) th).a() == 403) ? E8.a.i(new InvalidPinException()) : E8.a.i(this.f30351c.a(th));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object f(String str, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$getDeviceEmail$1 deviceRepositoryImpl$getDeviceEmail$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$getDeviceEmail$1) {
            deviceRepositoryImpl$getDeviceEmail$1 = (DeviceRepositoryImpl$getDeviceEmail$1) continuationImpl;
            int i10 = deviceRepositoryImpl$getDeviceEmail$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$getDeviceEmail$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$getDeviceEmail$1 = new DeviceRepositoryImpl$getDeviceEmail$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$getDeviceEmail$1 = new DeviceRepositoryImpl$getDeviceEmail$1(this, continuationImpl);
        }
        Object objF = deviceRepositoryImpl$getDeviceEmail$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$getDeviceEmail$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30349a;
                deviceRepositoryImpl$getDeviceEmail$1.L$0 = this;
                deviceRepositoryImpl$getDeviceEmail$1.label = 1;
                objF = aVar.f(str, deviceRepositoryImpl$getDeviceEmail$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = this;
            } catch (Throwable th) {
                th = th;
                hVar = this;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$getDeviceEmail$1.L$0;
            try {
                kotlin.b.b(objF);
            } catch (Throwable th2) {
                th = th2;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        }
        return new C8.a.b(objF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object k(String str, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$verifyDeviceMac$1 deviceRepositoryImpl$verifyDeviceMac$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$verifyDeviceMac$1) {
            deviceRepositoryImpl$verifyDeviceMac$1 = (DeviceRepositoryImpl$verifyDeviceMac$1) continuationImpl;
            int i10 = deviceRepositoryImpl$verifyDeviceMac$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$verifyDeviceMac$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$verifyDeviceMac$1 = new DeviceRepositoryImpl$verifyDeviceMac$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$verifyDeviceMac$1 = new DeviceRepositoryImpl$verifyDeviceMac$1(this, continuationImpl);
        }
        Object obj = deviceRepositoryImpl$verifyDeviceMac$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$verifyDeviceMac$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30349a;
                deviceRepositoryImpl$verifyDeviceMac$1.L$0 = this;
                deviceRepositoryImpl$verifyDeviceMac$1.label = 1;
                if (aVar.k(str, deviceRepositoryImpl$verifyDeviceMac$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = this;
            } catch (Throwable th) {
                th = th;
                hVar = this;
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$verifyDeviceMac$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object l(String str, String str2, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$createFirstGenDevice$1 deviceRepositoryImpl$createFirstGenDevice$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$createFirstGenDevice$1) {
            deviceRepositoryImpl$createFirstGenDevice$1 = (DeviceRepositoryImpl$createFirstGenDevice$1) continuationImpl;
            int i10 = deviceRepositoryImpl$createFirstGenDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$createFirstGenDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$createFirstGenDevice$1 = new DeviceRepositoryImpl$createFirstGenDevice$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$createFirstGenDevice$1 = new DeviceRepositoryImpl$createFirstGenDevice$1(this, continuationImpl);
        }
        Object objL = deviceRepositoryImpl$createFirstGenDevice$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$createFirstGenDevice$1.label;
        if (i11 == 0) {
            kotlin.b.b(objL);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30349a;
                deviceRepositoryImpl$createFirstGenDevice$1.L$0 = this;
                deviceRepositoryImpl$createFirstGenDevice$1.label = 1;
                objL = aVar.l(str, str2, deviceRepositoryImpl$createFirstGenDevice$1);
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = this;
            } catch (Throwable th) {
                th = th;
                hVar = this;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$createFirstGenDevice$1.L$0;
            try {
                kotlin.b.b(objL);
            } catch (Throwable th2) {
                th = th2;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        }
        A9.b bVar = (A9.b) objL;
        String str3 = bVar.f990a;
        SubscriptionType.a aVar2 = SubscriptionType.f30540b;
        String str4 = bVar.f991b;
        aVar2.getClass();
        return new C8.a.b(new G8.n(new G8.l(str3, SubscriptionType.a.a(str4), bVar.f992c, false), bVar.f993d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object m(String str, String str2, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$changeDevicePin$1 deviceRepositoryImpl$changeDevicePin$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$changeDevicePin$1) {
            deviceRepositoryImpl$changeDevicePin$1 = (DeviceRepositoryImpl$changeDevicePin$1) continuationImpl;
            int i10 = deviceRepositoryImpl$changeDevicePin$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$changeDevicePin$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$changeDevicePin$1 = new DeviceRepositoryImpl$changeDevicePin$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$changeDevicePin$1 = new DeviceRepositoryImpl$changeDevicePin$1(this, continuationImpl);
        }
        Object obj = deviceRepositoryImpl$changeDevicePin$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$changeDevicePin$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.obdeleven.network.c cVar = this.f30350b;
                deviceRepositoryImpl$changeDevicePin$1.L$0 = this;
                deviceRepositoryImpl$changeDevicePin$1.label = 1;
                if (cVar.d(str, str2, deviceRepositoryImpl$changeDevicePin$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                hVar = this;
                hVar.f30352d.d(th, false);
                return hVar.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$changeDevicePin$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                hVar.f30352d.d(th, false);
                return hVar.a(th);
            }
        }
        return E8.a.j(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object n(G8.m input, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$consumeDeviceBonus$1 deviceRepositoryImpl$consumeDeviceBonus$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$consumeDeviceBonus$1) {
            deviceRepositoryImpl$consumeDeviceBonus$1 = (DeviceRepositoryImpl$consumeDeviceBonus$1) continuationImpl;
            int i10 = deviceRepositoryImpl$consumeDeviceBonus$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$consumeDeviceBonus$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$consumeDeviceBonus$1 = new DeviceRepositoryImpl$consumeDeviceBonus$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$consumeDeviceBonus$1 = new DeviceRepositoryImpl$consumeDeviceBonus$1(this, continuationImpl);
        }
        Object obj = deviceRepositoryImpl$consumeDeviceBonus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$consumeDeviceBonus$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30349a;
                try {
                    kotlin.jvm.internal.i.e(input, "input");
                    p316z9.c cVar = new p316z9.c(input.f3520a, input.f3521b, kotlin.text.m.G(input.f3522c, ":", ""), input.f3523d, input.f3524e);
                    deviceRepositoryImpl$consumeDeviceBonus$1.L$0 = this;
                    deviceRepositoryImpl$consumeDeviceBonus$1.label = 1;
                    if (aVar.z(cVar, deviceRepositoryImpl$consumeDeviceBonus$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hVar = this;
                } catch (Throwable th) {
                    th = th;
                    hVar = this;
                    hVar.f30352d.d(th, false);
                    return new C8.a.C0024a(hVar.f30351c.a(th));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$consumeDeviceBonus$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object o(G8.j jVar, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$verifyDevice$1 deviceRepositoryImpl$verifyDevice$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$verifyDevice$1) {
            deviceRepositoryImpl$verifyDevice$1 = (DeviceRepositoryImpl$verifyDevice$1) continuationImpl;
            int i10 = deviceRepositoryImpl$verifyDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$verifyDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$verifyDevice$1 = new DeviceRepositoryImpl$verifyDevice$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$verifyDevice$1 = new DeviceRepositoryImpl$verifyDevice$1(this, continuationImpl);
        }
        Object objK = deviceRepositoryImpl$verifyDevice$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$verifyDevice$1.label;
        if (i11 == 0) {
            kotlin.b.b(objK);
            try {
                try {
                    C2832k c2832k = new C2832k(jVar.f3508a, jVar.f3509b, jVar.f3510c, jVar.f3511d, new Integer(jVar.f3512e), 32);
                    com.voltasit.sharednetwork.a aVar = this.f30349a;
                    deviceRepositoryImpl$verifyDevice$1.L$0 = this;
                    deviceRepositoryImpl$verifyDevice$1.label = 1;
                    objK = aVar.K(c2832k, deviceRepositoryImpl$verifyDevice$1);
                    if (objK == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hVar = this;
                } catch (Throwable th) {
                    th = th;
                    hVar = this;
                    hVar.f30352d.d(th, false);
                    return new C8.a.C0024a(hVar.f30351c.a(th));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$verifyDevice$1.L$0;
            try {
                kotlin.b.b(objK);
            } catch (Throwable th3) {
                th = th3;
                hVar.f30352d.d(th, false);
                return new C8.a.C0024a(hVar.f30351c.a(th));
            }
        }
        C2831j c2831j = (C2831j) objK;
        String str = c2831j.f48585a;
        SubscriptionType.a aVar2 = SubscriptionType.f30540b;
        String str2 = c2831j.f48586b;
        aVar2.getClass();
        return new C8.a.b(new G8.l(str, SubscriptionType.a.a(str2), c2831j.f48587c, c2831j.f48588d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object p(String str, String str2, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$authorizeDevice$1 deviceRepositoryImpl$authorizeDevice$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$authorizeDevice$1) {
            deviceRepositoryImpl$authorizeDevice$1 = (DeviceRepositoryImpl$authorizeDevice$1) continuationImpl;
            int i10 = deviceRepositoryImpl$authorizeDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$authorizeDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$authorizeDevice$1 = new DeviceRepositoryImpl$authorizeDevice$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$authorizeDevice$1 = new DeviceRepositoryImpl$authorizeDevice$1(this, continuationImpl);
        }
        Object obj = deviceRepositoryImpl$authorizeDevice$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$authorizeDevice$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.obdeleven.network.c cVar = this.f30350b;
                deviceRepositoryImpl$authorizeDevice$1.L$0 = this;
                deviceRepositoryImpl$authorizeDevice$1.label = 1;
                if (cVar.b(str, str2, deviceRepositoryImpl$authorizeDevice$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                hVar = this;
                hVar.f30352d.d(th, false);
                return hVar.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$authorizeDevice$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                hVar.f30352d.d(th, false);
                return hVar.a(th);
            }
        }
        return E8.a.j(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.f
    public final Object q(String str, ContinuationImpl continuationImpl) {
        DeviceRepositoryImpl$remindDevicePin$1 deviceRepositoryImpl$remindDevicePin$1;
        h hVar;
        if (continuationImpl instanceof DeviceRepositoryImpl$remindDevicePin$1) {
            deviceRepositoryImpl$remindDevicePin$1 = (DeviceRepositoryImpl$remindDevicePin$1) continuationImpl;
            int i10 = deviceRepositoryImpl$remindDevicePin$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceRepositoryImpl$remindDevicePin$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceRepositoryImpl$remindDevicePin$1 = new DeviceRepositoryImpl$remindDevicePin$1(this, continuationImpl);
            }
        } else {
            deviceRepositoryImpl$remindDevicePin$1 = new DeviceRepositoryImpl$remindDevicePin$1(this, continuationImpl);
        }
        Object obj = deviceRepositoryImpl$remindDevicePin$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceRepositoryImpl$remindDevicePin$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.obdeleven.network.c cVar = this.f30350b;
                deviceRepositoryImpl$remindDevicePin$1.L$0 = this;
                deviceRepositoryImpl$remindDevicePin$1.label = 1;
                if (cVar.f(str, deviceRepositoryImpl$remindDevicePin$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                hVar = this;
                hVar.f30352d.d(th, false);
                return E8.a.i(hVar.f30351c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) deviceRepositoryImpl$remindDevicePin$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                hVar.f30352d.d(th, false);
                return E8.a.i(hVar.f30351c.a(th));
            }
        }
        return E8.a.j(p293xa.r.f47939a);
    }
}
