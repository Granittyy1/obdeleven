package com.voltasit.sharednetwork;

import A9.c;
import A9.e;
import A9.g;
import A9.h;
import A9.j;
import A9.k;
import A9.p;
import Ia.l;
import com.braze.Constants;
import com.voltasit.sharednetwork.domain.common.CloudException;
import com.voltasit.sharednetwork.domain.exceptions.HttpException;
import io.ktor.http.C;
import io.ktor.http.CodecsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p037cb.C1527h;
import p037cb.O0;
import p037cb.y0;
import p050db.AbstractC2184a;
import p050db.d;
import p050db.r;
import p050db.s;
import p304y9.C2823b;
import p304y9.C2824c;
import p304y9.C2825d;
import p304y9.C2827f;
import p304y9.C2828g;
import p304y9.C2829h;
import p304y9.C2831j;
import p304y9.C2832k;
import p304y9.D;
import p304y9.E;
import p304y9.F;
import p304y9.G;
import p304y9.I;
import p304y9.J;
import p304y9.K;
import p304y9.L;
import p304y9.q;
import p304y9.u;
import p304y9.v;
import p304y9.x;
import p304y9.z;
import p316z9.f;
import p316z9.m;
import p316z9.n;
import p316z9.o;

/* JADX INFO: compiled from: ServerApiImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ServerApiImpl implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.dataSources.a f34432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f34433b = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.ServerApiImpl$json$1
        @Override // Ia.l
        public final p293xa.r invoke(d dVar) {
            d Json = dVar;
            i.e(Json, "$this$Json");
            Json.f34653c = true;
            return p293xa.r.f47939a;
        }
    });

    public ServerApiImpl(com.voltasit.sharednetwork.dataSources.a aVar) {
        this.f34432a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object A(n nVar, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        ServerApiImpl$loginWithFacebook$1 serverApiImpl$loginWithFacebook$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$loginWithFacebook$1) {
            serverApiImpl$loginWithFacebook$1 = (ServerApiImpl$loginWithFacebook$1) continuationImpl;
            int i10 = serverApiImpl$loginWithFacebook$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$loginWithFacebook$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$loginWithFacebook$1 = new ServerApiImpl$loginWithFacebook$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$loginWithFacebook$1 = new ServerApiImpl$loginWithFacebook$1(this, continuationImpl);
        }
        ServerApiImpl$loginWithFacebook$1 serverApiImpl$loginWithFacebook$2 = serverApiImpl$loginWithFacebook$1;
        Object objA = serverApiImpl$loginWithFacebook$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$loginWithFacebook$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(n.Companion.serializer(f.Companion.serializer()), nVar);
            serverApiImpl$loginWithFacebook$2.L$0 = this;
            serverApiImpl$loginWithFacebook$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "users", null, strB, linkedHashMap, serverApiImpl$loginWithFacebook$2, 2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$loginWithFacebook$2.L$0;
            b.b(objA);
        }
        z zVar = (z) objA;
        return new e(zVar.f48670a, (I) serverApiImpl.f34433b.a(I.Companion.serializer(), zVar.f48671b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object B(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        ServerApiImpl$getAppTranslations$1 serverApiImpl$getAppTranslations$1;
        if (continuationImpl instanceof ServerApiImpl$getAppTranslations$1) {
            serverApiImpl$getAppTranslations$1 = (ServerApiImpl$getAppTranslations$1) continuationImpl;
            int i10 = serverApiImpl$getAppTranslations$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getAppTranslations$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getAppTranslations$1 = new ServerApiImpl$getAppTranslations$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getAppTranslations$1 = new ServerApiImpl$getAppTranslations$1(this, continuationImpl);
        }
        Object obj = serverApiImpl$getAppTranslations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getAppTranslations$1.label;
        if (i11 == 0) {
            b.b(obj);
            y.s(new Pair("ocaIds", arrayList), new Pair("language", str));
            y0 y0Var = y0.f22677a;
            throw new SerializationException("Serializer for class 'kotlin.Any' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ServerApiImpl serverApiImpl = (ServerApiImpl) serverApiImpl$getAppTranslations$1.L$0;
        b.b(obj);
        return serverApiImpl.Q(Za.a.a(C2824c.Companion.serializer()), ((z) obj).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object C(ContinuationImpl continuationImpl) {
        ServerApiImpl$getUserDetails$1 serverApiImpl$getUserDetails$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getUserDetails$1) {
            serverApiImpl$getUserDetails$1 = (ServerApiImpl$getUserDetails$1) continuationImpl;
            int i10 = serverApiImpl$getUserDetails$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getUserDetails$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getUserDetails$1 = new ServerApiImpl$getUserDetails$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getUserDetails$1 = new ServerApiImpl$getUserDetails$1(this, continuationImpl);
        }
        ServerApiImpl$getUserDetails$1 serverApiImpl$getUserDetails$2 = serverApiImpl$getUserDetails$1;
        Object objA = serverApiImpl$getUserDetails$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getUserDetails$2.label;
        if (i11 == 0) {
            b.b(objA);
            serverApiImpl$getUserDetails$2.L$0 = this;
            serverApiImpl$getUserDetails$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getUserDetails", null, null, null, serverApiImpl$getUserDetails$2, 14);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getUserDetails$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(p.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object D(L l10, ContinuationImpl continuationImpl) {
        ServerApiImpl$hasVehicleFullBackup$1 serverApiImpl$hasVehicleFullBackup$1;
        Ya.a aVarSerializer;
        AbstractC2184a.C0357a c0357a;
        if (continuationImpl instanceof ServerApiImpl$hasVehicleFullBackup$1) {
            serverApiImpl$hasVehicleFullBackup$1 = (ServerApiImpl$hasVehicleFullBackup$1) continuationImpl;
            int i10 = serverApiImpl$hasVehicleFullBackup$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$hasVehicleFullBackup$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$hasVehicleFullBackup$1 = new ServerApiImpl$hasVehicleFullBackup$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$hasVehicleFullBackup$1 = new ServerApiImpl$hasVehicleFullBackup$1(this, continuationImpl);
        }
        ServerApiImpl$hasVehicleFullBackup$1 serverApiImpl$hasVehicleFullBackup$2 = serverApiImpl$hasVehicleFullBackup$1;
        Object obj = serverApiImpl$hasVehicleFullBackup$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$hasVehicleFullBackup$2.label;
        if (i11 == 0) {
            b.b(obj);
            AbstractC2184a.C0357a c0357a2 = AbstractC2184a.f34641d;
            String strB = c0357a2.b(L.Companion.serializer(), l10);
            aVarSerializer = x.Companion.serializer(C2825d.Companion.serializer());
            HashMap map = new HashMap();
            serverApiImpl$hasVehicleFullBackup$2.L$0 = c0357a2;
            serverApiImpl$hasVehicleFullBackup$2.L$1 = aVarSerializer;
            serverApiImpl$hasVehicleFullBackup$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "hasVehicleFullBackup", map, strB, serverApiImpl$hasVehicleFullBackup$2, 8);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0357a = c0357a2;
            obj = objB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$hasVehicleFullBackup$2.L$1;
            c0357a = (AbstractC2184a.C0357a) serverApiImpl$hasVehicleFullBackup$2.L$0;
            b.b(obj);
        }
        return ((x) c0357a.a(aVarSerializer, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object E(u uVar, ContinuationImpl continuationImpl) {
        ServerApiImpl$startOcaWriteSession$1 serverApiImpl$startOcaWriteSession$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$startOcaWriteSession$1) {
            serverApiImpl$startOcaWriteSession$1 = (ServerApiImpl$startOcaWriteSession$1) continuationImpl;
            int i10 = serverApiImpl$startOcaWriteSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$startOcaWriteSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$startOcaWriteSession$1 = new ServerApiImpl$startOcaWriteSession$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$startOcaWriteSession$1 = new ServerApiImpl$startOcaWriteSession$1(this, continuationImpl);
        }
        ServerApiImpl$startOcaWriteSession$1 serverApiImpl$startOcaWriteSession$2 = serverApiImpl$startOcaWriteSession$1;
        Object objA = serverApiImpl$startOcaWriteSession$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$startOcaWriteSession$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(u.Companion.serializer(), uVar);
            serverApiImpl$startOcaWriteSession$2.L$0 = this;
            serverApiImpl$startOcaWriteSession$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/startOcaWriteSession", null, strB, null, serverApiImpl$startOcaWriteSession$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$startOcaWriteSession$2.L$0;
            b.b(objA);
        }
        return ((j) serverApiImpl.Q(j.Companion.serializer(), ((z) objA).f48671b)).f1012a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object F(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        ServerApiImpl$getSfdToken$1 serverApiImpl$getSfdToken$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getSfdToken$1) {
            serverApiImpl$getSfdToken$1 = (ServerApiImpl$getSfdToken$1) continuationImpl;
            int i10 = serverApiImpl$getSfdToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getSfdToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getSfdToken$1 = new ServerApiImpl$getSfdToken$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getSfdToken$1 = new ServerApiImpl$getSfdToken$1(this, continuationImpl);
        }
        ServerApiImpl$getSfdToken$1 serverApiImpl$getSfdToken$2 = serverApiImpl$getSfdToken$1;
        Object objA = serverApiImpl$getSfdToken$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getSfdToken$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(m.Companion.serializer(), new m(str, str2, str3, str4));
            serverApiImpl$getSfdToken$2.L$0 = this;
            serverApiImpl$getSfdToken$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getEcuSfdTokenV2", null, strB, null, serverApiImpl$getSfdToken$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getSfdToken$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(A9.m.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object G(ContinuationImpl continuationImpl) {
        ServerApiImpl$shouldRedirectToMainApp$1 serverApiImpl$shouldRedirectToMainApp$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$shouldRedirectToMainApp$1) {
            serverApiImpl$shouldRedirectToMainApp$1 = (ServerApiImpl$shouldRedirectToMainApp$1) continuationImpl;
            int i10 = serverApiImpl$shouldRedirectToMainApp$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$shouldRedirectToMainApp$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$shouldRedirectToMainApp$1 = new ServerApiImpl$shouldRedirectToMainApp$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$shouldRedirectToMainApp$1 = new ServerApiImpl$shouldRedirectToMainApp$1(this, continuationImpl);
        }
        ServerApiImpl$shouldRedirectToMainApp$1 serverApiImpl$shouldRedirectToMainApp$2 = serverApiImpl$shouldRedirectToMainApp$1;
        Object objA = serverApiImpl$shouldRedirectToMainApp$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$shouldRedirectToMainApp$2.label;
        if (i11 == 0) {
            b.b(objA);
            serverApiImpl$shouldRedirectToMainApp$2.L$0 = this;
            serverApiImpl$shouldRedirectToMainApp$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/shouldRedirectToMainApp", null, null, null, serverApiImpl$shouldRedirectToMainApp$2, 14);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$shouldRedirectToMainApp$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(A9.n.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object H(o oVar, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1 serverApiImpl$notifyAboutSubscriptionFunctionUsage$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1) {
            serverApiImpl$notifyAboutSubscriptionFunctionUsage$1 = (ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1) continuationImpl;
            int i10 = serverApiImpl$notifyAboutSubscriptionFunctionUsage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$notifyAboutSubscriptionFunctionUsage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$notifyAboutSubscriptionFunctionUsage$1 = new ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$notifyAboutSubscriptionFunctionUsage$1 = new ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1(this, continuationImpl);
        }
        ServerApiImpl$notifyAboutSubscriptionFunctionUsage$1 serverApiImpl$notifyAboutSubscriptionFunctionUsage$2 = serverApiImpl$notifyAboutSubscriptionFunctionUsage$1;
        Object objA = serverApiImpl$notifyAboutSubscriptionFunctionUsage$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$notifyAboutSubscriptionFunctionUsage$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(o.Companion.serializer(), oVar);
            serverApiImpl$notifyAboutSubscriptionFunctionUsage$2.L$0 = this;
            serverApiImpl$notifyAboutSubscriptionFunctionUsage$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/notifyAboutSubscriptionFunctionUsage", null, strB, null, serverApiImpl$notifyAboutSubscriptionFunctionUsage$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$notifyAboutSubscriptionFunctionUsage$2.L$0;
            b.b(objA);
        }
        serverApiImpl.Q(A9.f.Companion.serializer(), ((z) objA).f48671b);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object I(String str, p316z9.p pVar, ContinuationImpl continuationImpl) {
        ServerApiImpl$updateFacebookAuth$1 serverApiImpl$updateFacebookAuth$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$updateFacebookAuth$1) {
            serverApiImpl$updateFacebookAuth$1 = (ServerApiImpl$updateFacebookAuth$1) continuationImpl;
            int i10 = serverApiImpl$updateFacebookAuth$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$updateFacebookAuth$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$updateFacebookAuth$1 = new ServerApiImpl$updateFacebookAuth$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$updateFacebookAuth$1 = new ServerApiImpl$updateFacebookAuth$1(this, continuationImpl);
        }
        Object objF = serverApiImpl$updateFacebookAuth$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$updateFacebookAuth$1.label;
        if (i11 == 0) {
            b.b(objF);
            String strB = AbstractC2184a.f34641d.b(p316z9.p.Companion.serializer(f.Companion.serializer()), pVar);
            String strC = B7.b.c("classes/_User/", str);
            serverApiImpl$updateFacebookAuth$1.L$0 = this;
            serverApiImpl$updateFacebookAuth$1.label = 1;
            objF = this.f34432a.f(strC, strB, new HashMap(), serverApiImpl$updateFacebookAuth$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$updateFacebookAuth$1.L$0;
            b.b(objF);
        }
        serverApiImpl.f34433b.a(A9.a.Companion.serializer(), ((z) objF).f48671b);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object J(String str, String str2, ContinuationImpl continuationImpl) {
        ServerApiImpl$getOriginalAppValues$1 serverApiImpl$getOriginalAppValues$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getOriginalAppValues$1) {
            serverApiImpl$getOriginalAppValues$1 = (ServerApiImpl$getOriginalAppValues$1) continuationImpl;
            int i10 = serverApiImpl$getOriginalAppValues$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getOriginalAppValues$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getOriginalAppValues$1 = new ServerApiImpl$getOriginalAppValues$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getOriginalAppValues$1 = new ServerApiImpl$getOriginalAppValues$1(this, continuationImpl);
        }
        ServerApiImpl$getOriginalAppValues$1 serverApiImpl$getOriginalAppValues$2 = serverApiImpl$getOriginalAppValues$1;
        Object objA = serverApiImpl$getOriginalAppValues$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getOriginalAppValues$2.label;
        if (i11 == 0) {
            b.b(objA);
            Map mapS = y.s(new Pair("ocaId", str), new Pair("vehicleId", str2));
            serverApiImpl$getOriginalAppValues$2.L$0 = this;
            serverApiImpl$getOriginalAppValues$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getVagOcaOriginalValue", mapS, null, null, serverApiImpl$getOriginalAppValues$2, 12);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getOriginalAppValues$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(p316z9.j.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object K(C2832k c2832k, ContinuationImpl continuationImpl) {
        ServerApiImpl$verifyDevice$1 serverApiImpl$verifyDevice$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$verifyDevice$1) {
            serverApiImpl$verifyDevice$1 = (ServerApiImpl$verifyDevice$1) continuationImpl;
            int i10 = serverApiImpl$verifyDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$verifyDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$verifyDevice$1 = new ServerApiImpl$verifyDevice$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$verifyDevice$1 = new ServerApiImpl$verifyDevice$1(this, continuationImpl);
        }
        ServerApiImpl$verifyDevice$1 serverApiImpl$verifyDevice$2 = serverApiImpl$verifyDevice$1;
        Object objA = serverApiImpl$verifyDevice$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$verifyDevice$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(C2832k.Companion.serializer(), c2832k);
            serverApiImpl$verifyDevice$2.L$0 = this;
            serverApiImpl$verifyDevice$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/verifyDeviceV2", null, strB, null, serverApiImpl$verifyDevice$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$verifyDevice$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(C2831j.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object L(ContinuationImpl continuationImpl) {
        ServerApiImpl$getSubscriptionProduct$1 serverApiImpl$getSubscriptionProduct$1;
        Ya.a aVar;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getSubscriptionProduct$1) {
            serverApiImpl$getSubscriptionProduct$1 = (ServerApiImpl$getSubscriptionProduct$1) continuationImpl;
            int i10 = serverApiImpl$getSubscriptionProduct$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getSubscriptionProduct$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getSubscriptionProduct$1 = new ServerApiImpl$getSubscriptionProduct$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getSubscriptionProduct$1 = new ServerApiImpl$getSubscriptionProduct$1(this, continuationImpl);
        }
        ServerApiImpl$getSubscriptionProduct$1 serverApiImpl$getSubscriptionProduct$2 = serverApiImpl$getSubscriptionProduct$1;
        Object obj = serverApiImpl$getSubscriptionProduct$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getSubscriptionProduct$2.label;
        if (i11 == 0) {
            b.b(obj);
            HashMap map = new HashMap();
            map.put("type", "subscription");
            map.put("client", "android");
            Ya.b bVarSerializer = x.Companion.serializer(Za.a.a(F.Companion.serializer()));
            r rVar = this.f34433b;
            serverApiImpl$getSubscriptionProduct$2.L$0 = rVar;
            serverApiImpl$getSubscriptionProduct$2.L$1 = bVarSerializer;
            serverApiImpl$getSubscriptionProduct$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getProducts", map, null, serverApiImpl$getSubscriptionProduct$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = bVarSerializer;
            obj = objB;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Ya.a) serverApiImpl$getSubscriptionProduct$2.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getSubscriptionProduct$2.L$0;
            b.b(obj);
        }
        return ((x) abstractC2184a.a(aVar, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object M(String value, String value2, ContinuationImpl continuationImpl) {
        ServerApiImpl$getOdxListByPlatform$1 serverApiImpl$getOdxListByPlatform$1;
        Ya.a aVarSerializer;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getOdxListByPlatform$1) {
            serverApiImpl$getOdxListByPlatform$1 = (ServerApiImpl$getOdxListByPlatform$1) continuationImpl;
            int i10 = serverApiImpl$getOdxListByPlatform$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getOdxListByPlatform$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getOdxListByPlatform$1 = new ServerApiImpl$getOdxListByPlatform$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getOdxListByPlatform$1 = new ServerApiImpl$getOdxListByPlatform$1(this, continuationImpl);
        }
        Object obj = serverApiImpl$getOdxListByPlatform$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getOdxListByPlatform$1.label;
        if (i11 == 0) {
            b.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i.e(value, "value");
            linkedHashMap.put("values", value);
            i.e(value2, "value");
            linkedHashMap.put("platform", value2);
            aVarSerializer = C2827f.Companion.serializer(Za.a.a(v.Companion.serializer()));
            String str = "where=" + B9.a.a(linkedHashMap) + "&limit=" + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            r rVar = this.f34433b;
            serverApiImpl$getOdxListByPlatform$1.L$0 = rVar;
            serverApiImpl$getOdxListByPlatform$1.L$1 = aVarSerializer;
            serverApiImpl$getOdxListByPlatform$1.label = 1;
            Object objE = this.f34432a.e("ODX", str, serverApiImpl$getOdxListByPlatform$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objE;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$getOdxListByPlatform$1.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getOdxListByPlatform$1.L$0;
            b.b(obj);
        }
        return ((C2827f) abstractC2184a.a(aVarSerializer, (String) obj)).f48559c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object N(C2823b c2823b, ContinuationImpl continuationImpl) {
        ServerApiImpl$getAgreements$1 serverApiImpl$getAgreements$1;
        Ya.a aVarSerializer;
        AbstractC2184a.C0357a c0357a;
        if (continuationImpl instanceof ServerApiImpl$getAgreements$1) {
            serverApiImpl$getAgreements$1 = (ServerApiImpl$getAgreements$1) continuationImpl;
            int i10 = serverApiImpl$getAgreements$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getAgreements$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getAgreements$1 = new ServerApiImpl$getAgreements$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getAgreements$1 = new ServerApiImpl$getAgreements$1(this, continuationImpl);
        }
        ServerApiImpl$getAgreements$1 serverApiImpl$getAgreements$2 = serverApiImpl$getAgreements$1;
        Object obj = serverApiImpl$getAgreements$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getAgreements$2.label;
        if (i11 == 0) {
            b.b(obj);
            AbstractC2184a.C0357a c0357a2 = AbstractC2184a.f34641d;
            String strB = c0357a2.b(C2823b.Companion.serializer(), c2823b);
            aVarSerializer = x.Companion.serializer(Za.a.a(q.Companion.serializer()));
            HashMap map = new HashMap();
            serverApiImpl$getAgreements$2.L$0 = c0357a2;
            serverApiImpl$getAgreements$2.L$1 = aVarSerializer;
            serverApiImpl$getAgreements$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getAgreements", map, strB, serverApiImpl$getAgreements$2, 8);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0357a = c0357a2;
            obj = objB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$getAgreements$2.L$1;
            c0357a = (AbstractC2184a.C0357a) serverApiImpl$getAgreements$2.L$0;
            b.b(obj);
        }
        return ((x) c0357a.a(aVarSerializer, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object O(String str, String str2, ContinuationImpl continuationImpl) {
        ServerApiImpl$getOcaCommands$1 serverApiImpl$getOcaCommands$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getOcaCommands$1) {
            serverApiImpl$getOcaCommands$1 = (ServerApiImpl$getOcaCommands$1) continuationImpl;
            int i10 = serverApiImpl$getOcaCommands$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getOcaCommands$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getOcaCommands$1 = new ServerApiImpl$getOcaCommands$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getOcaCommands$1 = new ServerApiImpl$getOcaCommands$1(this, continuationImpl);
        }
        ServerApiImpl$getOcaCommands$1 serverApiImpl$getOcaCommands$2 = serverApiImpl$getOcaCommands$1;
        Object objB = serverApiImpl$getOcaCommands$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getOcaCommands$2.label;
        if (i11 == 0) {
            b.b(objB);
            String strB = AbstractC2184a.f34641d.b(p304y9.r.Companion.serializer(), new p304y9.r(str2, str));
            serverApiImpl$getOcaCommands$2.L$0 = this;
            serverApiImpl$getOcaCommands$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getOcaCommands", null, strB, serverApiImpl$getOcaCommands$2, 10);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getOcaCommands$2.L$0;
            b.b(objB);
        }
        return ((g) serverApiImpl.R(g.Companion.serializer(), (String) objB)).f1005a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object P(ContinuationImpl continuationImpl) {
        ServerApiImpl$generate2FaKey$1 serverApiImpl$generate2FaKey$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$generate2FaKey$1) {
            serverApiImpl$generate2FaKey$1 = (ServerApiImpl$generate2FaKey$1) continuationImpl;
            int i10 = serverApiImpl$generate2FaKey$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$generate2FaKey$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$generate2FaKey$1 = new ServerApiImpl$generate2FaKey$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$generate2FaKey$1 = new ServerApiImpl$generate2FaKey$1(this, continuationImpl);
        }
        ServerApiImpl$generate2FaKey$1 serverApiImpl$generate2FaKey$2 = serverApiImpl$generate2FaKey$1;
        Object objB = serverApiImpl$generate2FaKey$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$generate2FaKey$2.label;
        if (i11 == 0) {
            b.b(objB);
            serverApiImpl$generate2FaKey$2.L$0 = this;
            serverApiImpl$generate2FaKey$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "generate2FaKey", null, null, serverApiImpl$generate2FaKey$2, 14);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$generate2FaKey$2.L$0;
            b.b(objB);
        }
        return serverApiImpl.R(A9.d.Companion.serializer(), (String) objB);
    }

    public final <T> T Q(Ya.b<T> bVar, String str) throws Exception {
        k<T> kVar = ((A9.l) this.f34433b.a(A9.l.Companion.serializer(bVar), str)).f1020a;
        int i10 = kVar.f1017c;
        T t8 = kVar.f1015a;
        if (i10 < 300) {
            if (t8 != null) {
                return t8;
            }
            throw new Exception("Response is successful but data field in result is null!");
        }
        if (t8 != null) {
            throw new Exception("Unhandled response in ServerApiImpl");
        }
        String str2 = kVar.f1016b;
        if (kotlin.text.n.S(str2)) {
            throw new Exception("Both message and data fields in response are empty. Check if cloud function is valid!");
        }
        throw new HttpException(kVar.f1017c, str2);
    }

    @p293xa.d
    public final <T> T R(Ya.b<T> bVar, String str) throws Exception {
        k<T> kVar = ((A9.l) this.f34433b.a(A9.l.Companion.serializer(bVar), str)).f1020a;
        int i10 = kVar.f1017c;
        T t8 = kVar.f1015a;
        if (i10 < 300) {
            if (t8 != null) {
                return t8;
            }
            throw new Exception("Response is successful but data field in result is null!");
        }
        if (t8 != null) {
            throw new Exception("Unhandled response in ServerApiImpl");
        }
        String str2 = kVar.f1016b;
        if (kotlin.text.n.S(str2)) {
            throw new Exception("Both message and data fields in response are empty. Check if cloud function is valid!");
        }
        int i11 = CloudException.f34455b;
        throw CloudException.a.a(kVar.f1017c, str2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object a(ContinuationImpl continuationImpl) {
        ServerApiImpl$getCreditProducts$1 serverApiImpl$getCreditProducts$1;
        Ya.a aVar;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getCreditProducts$1) {
            serverApiImpl$getCreditProducts$1 = (ServerApiImpl$getCreditProducts$1) continuationImpl;
            int i10 = serverApiImpl$getCreditProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getCreditProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getCreditProducts$1 = new ServerApiImpl$getCreditProducts$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getCreditProducts$1 = new ServerApiImpl$getCreditProducts$1(this, continuationImpl);
        }
        ServerApiImpl$getCreditProducts$1 serverApiImpl$getCreditProducts$2 = serverApiImpl$getCreditProducts$1;
        Object obj = serverApiImpl$getCreditProducts$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getCreditProducts$2.label;
        if (i11 == 0) {
            b.b(obj);
            HashMap map = new HashMap();
            map.put("type", "credits");
            map.put("client", "android");
            Ya.b bVarSerializer = x.Companion.serializer(Za.a.a(C2829h.Companion.serializer()));
            r rVar = this.f34433b;
            serverApiImpl$getCreditProducts$2.L$0 = rVar;
            serverApiImpl$getCreditProducts$2.L$1 = bVarSerializer;
            serverApiImpl$getCreditProducts$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getProducts", map, null, serverApiImpl$getCreditProducts$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = bVarSerializer;
            obj = objB;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Ya.a) serverApiImpl$getCreditProducts$2.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getCreditProducts$2.L$0;
            b.b(obj);
        }
        return ((x) abstractC2184a.a(aVar, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ServerApiImpl$incrementOcaUsage$1 serverApiImpl$incrementOcaUsage$1;
        if (continuationImpl instanceof ServerApiImpl$incrementOcaUsage$1) {
            serverApiImpl$incrementOcaUsage$1 = (ServerApiImpl$incrementOcaUsage$1) continuationImpl;
            int i10 = serverApiImpl$incrementOcaUsage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$incrementOcaUsage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$incrementOcaUsage$1 = new ServerApiImpl$incrementOcaUsage$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$incrementOcaUsage$1 = new ServerApiImpl$incrementOcaUsage$1(this, continuationImpl);
        }
        ServerApiImpl$incrementOcaUsage$1 serverApiImpl$incrementOcaUsage$2 = serverApiImpl$incrementOcaUsage$1;
        Object obj = serverApiImpl$incrementOcaUsage$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$incrementOcaUsage$2.label;
        if (i11 == 0) {
            b.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appObjectId", str);
            serverApiImpl$incrementOcaUsage$2.label = 1;
            if (com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "incrementOcaUsage", linkedHashMap, null, serverApiImpl$incrementOcaUsage$2, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$invalidateOriginalAppValue$1 serverApiImpl$invalidateOriginalAppValue$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$invalidateOriginalAppValue$1) {
            serverApiImpl$invalidateOriginalAppValue$1 = (ServerApiImpl$invalidateOriginalAppValue$1) continuationImpl;
            int i10 = serverApiImpl$invalidateOriginalAppValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$invalidateOriginalAppValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$invalidateOriginalAppValue$1 = new ServerApiImpl$invalidateOriginalAppValue$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$invalidateOriginalAppValue$1 = new ServerApiImpl$invalidateOriginalAppValue$1(this, continuationImpl);
        }
        ServerApiImpl$invalidateOriginalAppValue$1 serverApiImpl$invalidateOriginalAppValue$2 = serverApiImpl$invalidateOriginalAppValue$1;
        Object objA = serverApiImpl$invalidateOriginalAppValue$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$invalidateOriginalAppValue$2.label;
        if (i11 == 0) {
            b.b(objA);
            Map mapS = y.s(new Pair("ocaId", str), new Pair("vehicleId", str2), new Pair("id", str3));
            y0 y0Var = y0.f22677a;
            String strB = this.f34433b.b(new p037cb.L(y0Var, y0Var), mapS);
            serverApiImpl$invalidateOriginalAppValue$2.L$0 = this;
            serverApiImpl$invalidateOriginalAppValue$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/invalidateVagOcaOriginalValue", null, strB, null, serverApiImpl$invalidateOriginalAppValue$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$invalidateOriginalAppValue$2.L$0;
            b.b(objA);
        }
        p293xa.r rVar = p293xa.r.f47939a;
        i.e(rVar, "<this>");
        serverApiImpl.Q(O0.f22572b, ((z) objA).f48671b);
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object d(p316z9.q qVar, ContinuationImpl continuationImpl) {
        ServerApiImpl$updatePersonalInfo$1 serverApiImpl$updatePersonalInfo$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$updatePersonalInfo$1) {
            serverApiImpl$updatePersonalInfo$1 = (ServerApiImpl$updatePersonalInfo$1) continuationImpl;
            int i10 = serverApiImpl$updatePersonalInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$updatePersonalInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$updatePersonalInfo$1 = new ServerApiImpl$updatePersonalInfo$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$updatePersonalInfo$1 = new ServerApiImpl$updatePersonalInfo$1(this, continuationImpl);
        }
        ServerApiImpl$updatePersonalInfo$1 serverApiImpl$updatePersonalInfo$2 = serverApiImpl$updatePersonalInfo$1;
        Object objA = serverApiImpl$updatePersonalInfo$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$updatePersonalInfo$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.q.Companion.serializer(), qVar);
            serverApiImpl$updatePersonalInfo$2.L$0 = this;
            serverApiImpl$updatePersonalInfo$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/createUserPersonalInfo", null, strB, null, serverApiImpl$updatePersonalInfo$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$updatePersonalInfo$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(p316z9.q.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object e(String str, ContinuationImpl continuationImpl) {
        ServerApiImpl$refundOcaCredits$1 serverApiImpl$refundOcaCredits$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$refundOcaCredits$1) {
            serverApiImpl$refundOcaCredits$1 = (ServerApiImpl$refundOcaCredits$1) continuationImpl;
            int i10 = serverApiImpl$refundOcaCredits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$refundOcaCredits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$refundOcaCredits$1 = new ServerApiImpl$refundOcaCredits$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$refundOcaCredits$1 = new ServerApiImpl$refundOcaCredits$1(this, continuationImpl);
        }
        ServerApiImpl$refundOcaCredits$1 serverApiImpl$refundOcaCredits$2 = serverApiImpl$refundOcaCredits$1;
        Object objB = serverApiImpl$refundOcaCredits$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$refundOcaCredits$2.label;
        if (i11 == 0) {
            b.b(objB);
            String strB = AbstractC2184a.f34641d.b(A9.i.Companion.serializer(), new A9.i(str));
            serverApiImpl$refundOcaCredits$2.L$0 = this;
            serverApiImpl$refundOcaCredits$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "refundOcaCredits", null, strB, serverApiImpl$refundOcaCredits$2, 10);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$refundOcaCredits$2.L$0;
            b.b(objB);
        }
        return ((A9.f) serverApiImpl.R(A9.f.Companion.serializer(), (String) objB)).f1002a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object f(String str, ContinuationImpl continuationImpl) {
        ServerApiImpl$getDeviceEmail$1 serverApiImpl$getDeviceEmail$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getDeviceEmail$1) {
            serverApiImpl$getDeviceEmail$1 = (ServerApiImpl$getDeviceEmail$1) continuationImpl;
            int i10 = serverApiImpl$getDeviceEmail$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getDeviceEmail$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getDeviceEmail$1 = new ServerApiImpl$getDeviceEmail$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getDeviceEmail$1 = new ServerApiImpl$getDeviceEmail$1(this, continuationImpl);
        }
        ServerApiImpl$getDeviceEmail$1 serverApiImpl$getDeviceEmail$2 = serverApiImpl$getDeviceEmail$1;
        Object objA = serverApiImpl$getDeviceEmail$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getDeviceEmail$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.d.Companion.serializer(), new p316z9.d(str));
            serverApiImpl$getDeviceEmail$2.L$0 = this;
            serverApiImpl$getDeviceEmail$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getDeviceById", null, strB, null, serverApiImpl$getDeviceEmail$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getDeviceEmail$2.L$0;
            b.b(objA);
        }
        return ((c) serverApiImpl.Q(c.Companion.serializer(), ((z) objA).f48671b)).f996b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object g(ContinuationImpl continuationImpl) {
        ServerApiImpl$getShadowCreditProducts$1 serverApiImpl$getShadowCreditProducts$1;
        Ya.a aVar;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getShadowCreditProducts$1) {
            serverApiImpl$getShadowCreditProducts$1 = (ServerApiImpl$getShadowCreditProducts$1) continuationImpl;
            int i10 = serverApiImpl$getShadowCreditProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getShadowCreditProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getShadowCreditProducts$1 = new ServerApiImpl$getShadowCreditProducts$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getShadowCreditProducts$1 = new ServerApiImpl$getShadowCreditProducts$1(this, continuationImpl);
        }
        ServerApiImpl$getShadowCreditProducts$1 serverApiImpl$getShadowCreditProducts$2 = serverApiImpl$getShadowCreditProducts$1;
        Object obj = serverApiImpl$getShadowCreditProducts$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getShadowCreditProducts$2.label;
        if (i11 == 0) {
            b.b(obj);
            HashMap map = new HashMap();
            map.put("type", "fair_use_adjustment");
            map.put("client", "android");
            Ya.b bVarSerializer = x.Companion.serializer(Za.a.a(E.Companion.serializer()));
            r rVar = this.f34433b;
            serverApiImpl$getShadowCreditProducts$2.L$0 = rVar;
            serverApiImpl$getShadowCreditProducts$2.L$1 = bVarSerializer;
            serverApiImpl$getShadowCreditProducts$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getProducts", map, null, serverApiImpl$getShadowCreditProducts$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = bVarSerializer;
            obj = objB;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Ya.a) serverApiImpl$getShadowCreditProducts$2.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getShadowCreditProducts$2.L$0;
            b.b(obj);
        }
        return ((x) abstractC2184a.a(aVar, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object h(ContinuationImpl continuationImpl) {
        ServerApiImpl$getPersonalInfo$1 serverApiImpl$getPersonalInfo$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getPersonalInfo$1) {
            serverApiImpl$getPersonalInfo$1 = (ServerApiImpl$getPersonalInfo$1) continuationImpl;
            int i10 = serverApiImpl$getPersonalInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getPersonalInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getPersonalInfo$1 = new ServerApiImpl$getPersonalInfo$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getPersonalInfo$1 = new ServerApiImpl$getPersonalInfo$1(this, continuationImpl);
        }
        Object objC = serverApiImpl$getPersonalInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getPersonalInfo$1.label;
        if (i11 == 0) {
            b.b(objC);
            serverApiImpl$getPersonalInfo$1.L$0 = this;
            serverApiImpl$getPersonalInfo$1.label = 1;
            objC = this.f34432a.c(new l<io.ktor.client.request.a, p293xa.r>() { // from class: com.voltasit.sharednetwork.ServerApiImpl$getPersonalInfo$resultBody$1

                /* JADX INFO: renamed from: com.voltasit.sharednetwork.ServerApiImpl$getPersonalInfo$resultBody$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: ServerApiImpl.kt */
                final class AnonymousClass1 extends Lambda implements Ia.p<io.ktor.http.x, io.ktor.http.x, p293xa.r> {

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public static final AnonymousClass1 f34435h = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(io.ktor.http.x xVar, io.ktor.http.x xVar2) {
                        io.ktor.http.x url = xVar;
                        io.ktor.http.x it = xVar2;
                        i.e(url, "$this$url");
                        i.e(it, "it");
                        C c10 = url.j;
                        c10.getClass();
                        c10.f40456a.h(CodecsKt.f("order", false), CodecsKt.f("-createdAt", true));
                        return p293xa.r.f47939a;
                    }
                }

                @Override // Ia.l
                public final p293xa.r invoke(io.ktor.client.request.a aVar) {
                    io.ktor.client.request.a request = aVar;
                    i.e(request, "$this$request");
                    AnonymousClass1 block = AnonymousClass1.f34435h;
                    i.e(block, "block");
                    io.ktor.http.x xVar = request.f40410a;
                    block.invoke(xVar, xVar);
                    return p293xa.r.f47939a;
                }
            }, serverApiImpl$getPersonalInfo$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getPersonalInfo$1.L$0;
            b.b(objC);
        }
        return ((C2827f) serverApiImpl.f34433b.a(C2827f.Companion.serializer(Za.a.a(p316z9.q.Companion.serializer())), (String) objC)).f48559c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object i(int i10, ContinuationImpl continuationImpl) {
        ServerApiImpl$signAgreement$1 serverApiImpl$signAgreement$1;
        Ya.a aVarSerializer;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$signAgreement$1) {
            serverApiImpl$signAgreement$1 = (ServerApiImpl$signAgreement$1) continuationImpl;
            int i11 = serverApiImpl$signAgreement$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$signAgreement$1.label = i11 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$signAgreement$1 = new ServerApiImpl$signAgreement$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$signAgreement$1 = new ServerApiImpl$signAgreement$1(this, continuationImpl);
        }
        ServerApiImpl$signAgreement$1 serverApiImpl$signAgreement$2 = serverApiImpl$signAgreement$1;
        Object obj = serverApiImpl$signAgreement$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = serverApiImpl$signAgreement$2.label;
        if (i12 == 0) {
            b.b(obj);
            HashMap map = new HashMap();
            map.put("type", String.valueOf(i10));
            aVarSerializer = x.Companion.serializer(C1527h.f22612a);
            r rVar = this.f34433b;
            serverApiImpl$signAgreement$2.L$0 = rVar;
            serverApiImpl$signAgreement$2.L$1 = aVarSerializer;
            serverApiImpl$signAgreement$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "signAgreement", map, null, serverApiImpl$signAgreement$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC2184a = rVar;
            obj = objB;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$signAgreement$2.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$signAgreement$2.L$0;
            b.b(obj);
        }
        return ((x) abstractC2184a.a(aVarSerializer, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object j(String str, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$disable2FaBackupCode$1 serverApiImpl$disable2FaBackupCode$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$disable2FaBackupCode$1) {
            serverApiImpl$disable2FaBackupCode$1 = (ServerApiImpl$disable2FaBackupCode$1) continuationImpl;
            int i10 = serverApiImpl$disable2FaBackupCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$disable2FaBackupCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$disable2FaBackupCode$1 = new ServerApiImpl$disable2FaBackupCode$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$disable2FaBackupCode$1 = new ServerApiImpl$disable2FaBackupCode$1(this, continuationImpl);
        }
        ServerApiImpl$disable2FaBackupCode$1 serverApiImpl$disable2FaBackupCode$2 = serverApiImpl$disable2FaBackupCode$1;
        Object objB = serverApiImpl$disable2FaBackupCode$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$disable2FaBackupCode$2.label;
        if (i11 == 0) {
            b.b(objB);
            HashMap mapR = y.r(new Pair("backupCode", str));
            serverApiImpl$disable2FaBackupCode$2.L$0 = this;
            serverApiImpl$disable2FaBackupCode$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "disable2FaWithBackupCode", mapR, null, serverApiImpl$disable2FaBackupCode$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$disable2FaBackupCode$2.L$0;
            b.b(objB);
        }
        serverApiImpl.R(A9.f.Companion.serializer(), (String) objB);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object k(String str, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$verifyDeviceMac$1 serverApiImpl$verifyDeviceMac$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$verifyDeviceMac$1) {
            serverApiImpl$verifyDeviceMac$1 = (ServerApiImpl$verifyDeviceMac$1) continuationImpl;
            int i10 = serverApiImpl$verifyDeviceMac$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$verifyDeviceMac$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$verifyDeviceMac$1 = new ServerApiImpl$verifyDeviceMac$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$verifyDeviceMac$1 = new ServerApiImpl$verifyDeviceMac$1(this, continuationImpl);
        }
        ServerApiImpl$verifyDeviceMac$1 serverApiImpl$verifyDeviceMac$2 = serverApiImpl$verifyDeviceMac$1;
        Object objA = serverApiImpl$verifyDeviceMac$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$verifyDeviceMac$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.r.Companion.serializer(), new p316z9.r(str));
            serverApiImpl$verifyDeviceMac$2.L$0 = this;
            serverApiImpl$verifyDeviceMac$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/verifyDeviceMac", null, strB, null, serverApiImpl$verifyDeviceMac$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$verifyDeviceMac$2.L$0;
            b.b(objA);
        }
        serverApiImpl.Q(A9.f.Companion.serializer(), ((z) objA).f48671b);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object l(String str, String str2, ContinuationImpl continuationImpl) {
        ServerApiImpl$createFirstGenDevice$1 serverApiImpl$createFirstGenDevice$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$createFirstGenDevice$1) {
            serverApiImpl$createFirstGenDevice$1 = (ServerApiImpl$createFirstGenDevice$1) continuationImpl;
            int i10 = serverApiImpl$createFirstGenDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$createFirstGenDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$createFirstGenDevice$1 = new ServerApiImpl$createFirstGenDevice$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$createFirstGenDevice$1 = new ServerApiImpl$createFirstGenDevice$1(this, continuationImpl);
        }
        ServerApiImpl$createFirstGenDevice$1 serverApiImpl$createFirstGenDevice$2 = serverApiImpl$createFirstGenDevice$1;
        Object objA = serverApiImpl$createFirstGenDevice$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$createFirstGenDevice$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.b.Companion.serializer(), new p316z9.b(str, str2));
            serverApiImpl$createFirstGenDevice$2.L$0 = this;
            serverApiImpl$createFirstGenDevice$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/createFirstGenDevice", null, strB, null, serverApiImpl$createFirstGenDevice$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$createFirstGenDevice$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(A9.b.Companion.serializer(), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object m(String str, ContinuationImpl continuationImpl) {
        ServerApiImpl$verify2FaCode$1 serverApiImpl$verify2FaCode$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$verify2FaCode$1) {
            serverApiImpl$verify2FaCode$1 = (ServerApiImpl$verify2FaCode$1) continuationImpl;
            int i10 = serverApiImpl$verify2FaCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$verify2FaCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$verify2FaCode$1 = new ServerApiImpl$verify2FaCode$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$verify2FaCode$1 = new ServerApiImpl$verify2FaCode$1(this, continuationImpl);
        }
        ServerApiImpl$verify2FaCode$1 serverApiImpl$verify2FaCode$2 = serverApiImpl$verify2FaCode$1;
        Object objB = serverApiImpl$verify2FaCode$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$verify2FaCode$2.label;
        if (i11 == 0) {
            b.b(objB);
            HashMap mapR = y.r(new Pair("token", str));
            serverApiImpl$verify2FaCode$2.L$0 = this;
            serverApiImpl$verify2FaCode$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "validate2FaKey", mapR, null, serverApiImpl$verify2FaCode$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$verify2FaCode$2.L$0;
            b.b(objB);
        }
        return serverApiImpl.R(A9.q.Companion.serializer(), (String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object n(String str, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$disable2Fa$1 serverApiImpl$disable2Fa$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$disable2Fa$1) {
            serverApiImpl$disable2Fa$1 = (ServerApiImpl$disable2Fa$1) continuationImpl;
            int i10 = serverApiImpl$disable2Fa$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$disable2Fa$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$disable2Fa$1 = new ServerApiImpl$disable2Fa$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$disable2Fa$1 = new ServerApiImpl$disable2Fa$1(this, continuationImpl);
        }
        ServerApiImpl$disable2Fa$1 serverApiImpl$disable2Fa$2 = serverApiImpl$disable2Fa$1;
        Object objB = serverApiImpl$disable2Fa$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$disable2Fa$2.label;
        if (i11 == 0) {
            b.b(objB);
            HashMap mapR = y.r(new Pair("token", str));
            serverApiImpl$disable2Fa$2.L$0 = this;
            serverApiImpl$disable2Fa$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "disable2Fa", mapR, null, serverApiImpl$disable2Fa$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$disable2Fa$2.L$0;
            b.b(objB);
        }
        serverApiImpl.R(A9.f.Companion.serializer(), (String) objB);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object o(String value, ContinuationImpl continuationImpl) {
        ServerApiImpl$getVehicleBase$1 serverApiImpl$getVehicleBase$1;
        Ya.a aVarSerializer;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getVehicleBase$1) {
            serverApiImpl$getVehicleBase$1 = (ServerApiImpl$getVehicleBase$1) continuationImpl;
            int i10 = serverApiImpl$getVehicleBase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getVehicleBase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getVehicleBase$1 = new ServerApiImpl$getVehicleBase$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getVehicleBase$1 = new ServerApiImpl$getVehicleBase$1(this, continuationImpl);
        }
        Object objE = serverApiImpl$getVehicleBase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getVehicleBase$1.label;
        if (i11 == 0) {
            b.b(objE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i.e(value, "value");
            linkedHashMap.put("objectId", value);
            aVarSerializer = C2827f.Companion.serializer(Za.a.a(K.Companion.serializer()));
            String str = "where=" + B9.a.a(linkedHashMap) + "&limit=" + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            r rVar = this.f34433b;
            serverApiImpl$getVehicleBase$1.L$0 = rVar;
            serverApiImpl$getVehicleBase$1.L$1 = aVarSerializer;
            serverApiImpl$getVehicleBase$1.label = 1;
            objE = this.f34432a.e("VehicleBase", str, serverApiImpl$getVehicleBase$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$getVehicleBase$1.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getVehicleBase$1.L$0;
            b.b(objE);
        }
        return ((List) ((C2827f) abstractC2184a.a(aVarSerializer, (String) objE)).f48559c).get(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object p(ContinuationImpl continuationImpl) {
        ServerApiImpl$getHiddenTextIds$1 serverApiImpl$getHiddenTextIds$1;
        Ya.a aVar;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getHiddenTextIds$1) {
            serverApiImpl$getHiddenTextIds$1 = (ServerApiImpl$getHiddenTextIds$1) continuationImpl;
            int i10 = serverApiImpl$getHiddenTextIds$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getHiddenTextIds$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getHiddenTextIds$1 = new ServerApiImpl$getHiddenTextIds$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getHiddenTextIds$1 = new ServerApiImpl$getHiddenTextIds$1(this, continuationImpl);
        }
        Object objE = serverApiImpl$getHiddenTextIds$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getHiddenTextIds$1.label;
        if (i11 == 0) {
            b.b(objE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Ya.b bVarSerializer = C2827f.Companion.serializer(Za.a.a(p304y9.o.Companion.serializer()));
            String str = "where=" + B9.a.a(linkedHashMap) + "&limit=" + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            r rVar = this.f34433b;
            serverApiImpl$getHiddenTextIds$1.L$0 = rVar;
            serverApiImpl$getHiddenTextIds$1.L$1 = bVarSerializer;
            serverApiImpl$getHiddenTextIds$1.label = 1;
            objE = this.f34432a.e("HiddenTextId", str, serverApiImpl$getHiddenTextIds$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = bVarSerializer;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Ya.a) serverApiImpl$getHiddenTextIds$1.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getHiddenTextIds$1.L$0;
            b.b(objE);
        }
        return ((C2827f) abstractC2184a.a(aVar, (String) objE)).f48559c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object q(List list, String str, ContinuationImpl continuationImpl) {
        ServerApiImpl$getUdsFaultDescriptions$1 serverApiImpl$getUdsFaultDescriptions$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getUdsFaultDescriptions$1) {
            serverApiImpl$getUdsFaultDescriptions$1 = (ServerApiImpl$getUdsFaultDescriptions$1) continuationImpl;
            int i10 = serverApiImpl$getUdsFaultDescriptions$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getUdsFaultDescriptions$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getUdsFaultDescriptions$1 = new ServerApiImpl$getUdsFaultDescriptions$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getUdsFaultDescriptions$1 = new ServerApiImpl$getUdsFaultDescriptions$1(this, continuationImpl);
        }
        ServerApiImpl$getUdsFaultDescriptions$1 serverApiImpl$getUdsFaultDescriptions$2 = serverApiImpl$getUdsFaultDescriptions$1;
        Object objA = serverApiImpl$getUdsFaultDescriptions$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getUdsFaultDescriptions$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.i.Companion.serializer(), new p316z9.i(str, list));
            serverApiImpl$getUdsFaultDescriptions$2.L$0 = this;
            serverApiImpl$getUdsFaultDescriptions$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getUdsFaultDescriptionsV2", null, strB, null, serverApiImpl$getUdsFaultDescriptions$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getUdsFaultDescriptions$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(Za.a.b(y0.f22677a, A9.o.Companion.serializer()), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object r(ContinuationImpl continuationImpl) {
        ServerApiImpl$getUserPermissions$1 serverApiImpl$getUserPermissions$1;
        Ya.a aVar;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getUserPermissions$1) {
            serverApiImpl$getUserPermissions$1 = (ServerApiImpl$getUserPermissions$1) continuationImpl;
            int i10 = serverApiImpl$getUserPermissions$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getUserPermissions$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getUserPermissions$1 = new ServerApiImpl$getUserPermissions$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getUserPermissions$1 = new ServerApiImpl$getUserPermissions$1(this, continuationImpl);
        }
        ServerApiImpl$getUserPermissions$1 serverApiImpl$getUserPermissions$2 = serverApiImpl$getUserPermissions$1;
        Object obj = serverApiImpl$getUserPermissions$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getUserPermissions$2.label;
        if (i11 == 0) {
            b.b(obj);
            Ya.b bVarSerializer = x.Companion.serializer(Za.a.a(J.Companion.serializer()));
            HashMap map = new HashMap();
            r rVar = this.f34433b;
            serverApiImpl$getUserPermissions$2.L$0 = rVar;
            serverApiImpl$getUserPermissions$2.L$1 = bVarSerializer;
            serverApiImpl$getUserPermissions$2.label = 1;
            Object objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getUserPermissions", map, null, serverApiImpl$getUserPermissions$2, 12);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = bVarSerializer;
            obj = objB;
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Ya.a) serverApiImpl$getUserPermissions$2.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getUserPermissions$2.L$0;
            b.b(obj);
        }
        return ((x) abstractC2184a.a(aVar, (String) obj)).f48664c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object s(p316z9.e eVar, ContinuationImpl continuationImpl) {
        ServerApiImpl$login$1 serverApiImpl$login$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$login$1) {
            serverApiImpl$login$1 = (ServerApiImpl$login$1) continuationImpl;
            int i10 = serverApiImpl$login$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$login$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$login$1 = new ServerApiImpl$login$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$login$1 = new ServerApiImpl$login$1(this, continuationImpl);
        }
        ServerApiImpl$login$1 serverApiImpl$login$2 = serverApiImpl$login$1;
        Object objA = serverApiImpl$login$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$login$2.label;
        if (i11 == 0) {
            b.b(objA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = eVar.f48968c;
            if (str != null) {
                linkedHashMap.put("temporary-password", str);
            }
            String str2 = eVar.f48969d;
            if (str2 != null) {
                linkedHashMap.put("backup-code", str2);
            }
            String strB = this.f34433b.b(p316z9.e.Companion.serializer(), eVar);
            serverApiImpl$login$2.L$0 = this;
            serverApiImpl$login$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "login", null, strB, linkedHashMap, serverApiImpl$login$2, 2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$login$2.L$0;
            b.b(objA);
        }
        String str3 = ((z) objA).f48671b;
        return serverApiImpl.f34433b.a(I.Companion.serializer(), str3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object t(String str, boolean z10, ContinuationImpl continuationImpl) {
        ServerApiImpl$getOcaList$1 serverApiImpl$getOcaList$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getOcaList$1) {
            serverApiImpl$getOcaList$1 = (ServerApiImpl$getOcaList$1) continuationImpl;
            int i10 = serverApiImpl$getOcaList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getOcaList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getOcaList$1 = new ServerApiImpl$getOcaList$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getOcaList$1 = new ServerApiImpl$getOcaList$1(this, continuationImpl);
        }
        ServerApiImpl$getOcaList$1 serverApiImpl$getOcaList$2 = serverApiImpl$getOcaList$1;
        Object objB = serverApiImpl$getOcaList$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getOcaList$2.label;
        if (i11 == 0) {
            b.b(objB);
            p304y9.n nVar = new p304y9.n(str, z10);
            String strB = this.f34433b.b(p304y9.n.Companion.serializer(), nVar);
            serverApiImpl$getOcaList$2.L$0 = this;
            serverApiImpl$getOcaList$2.label = 1;
            objB = com.voltasit.sharednetwork.dataSources.a.C0353a.b(this.f34432a, "getOcaList", null, strB, serverApiImpl$getOcaList$2, 10);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getOcaList$2.L$0;
            b.b(objB);
        }
        return ((h) serverApiImpl.R(h.Companion.serializer(), (String) objB)).f1008a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object u(ContinuationImpl continuationImpl) {
        ServerApiImpl$getControlUnitBases$1 serverApiImpl$getControlUnitBases$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getControlUnitBases$1) {
            serverApiImpl$getControlUnitBases$1 = (ServerApiImpl$getControlUnitBases$1) continuationImpl;
            int i10 = serverApiImpl$getControlUnitBases$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getControlUnitBases$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getControlUnitBases$1 = new ServerApiImpl$getControlUnitBases$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getControlUnitBases$1 = new ServerApiImpl$getControlUnitBases$1(this, continuationImpl);
        }
        ServerApiImpl$getControlUnitBases$1 serverApiImpl$getControlUnitBases$2 = serverApiImpl$getControlUnitBases$1;
        Object objA = serverApiImpl$getControlUnitBases$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getControlUnitBases$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.h.Companion.serializer(), new p316z9.h());
            serverApiImpl$getControlUnitBases$2.L$0 = this;
            serverApiImpl$getControlUnitBases$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getVagControlUnitBasesV2", null, strB, null, serverApiImpl$getControlUnitBases$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getControlUnitBases$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(Za.a.a(C2828g.Companion.serializer()), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object v(ContinuationImpl continuationImpl) {
        ServerApiImpl$getSfdCountries$1 serverApiImpl$getSfdCountries$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$getSfdCountries$1) {
            serverApiImpl$getSfdCountries$1 = (ServerApiImpl$getSfdCountries$1) continuationImpl;
            int i10 = serverApiImpl$getSfdCountries$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getSfdCountries$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getSfdCountries$1 = new ServerApiImpl$getSfdCountries$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getSfdCountries$1 = new ServerApiImpl$getSfdCountries$1(this, continuationImpl);
        }
        ServerApiImpl$getSfdCountries$1 serverApiImpl$getSfdCountries$2 = serverApiImpl$getSfdCountries$1;
        Object objA = serverApiImpl$getSfdCountries$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getSfdCountries$2.label;
        if (i11 == 0) {
            b.b(objA);
            serverApiImpl$getSfdCountries$2.L$0 = this;
            serverApiImpl$getSfdCountries$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/getVagSfdSupportedCountries", null, null, null, serverApiImpl$getSfdCountries$2, 14);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$getSfdCountries$2.L$0;
            b.b(objA);
        }
        return serverApiImpl.Q(Za.a.a(D.Companion.serializer()), ((z) objA).f48671b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object w(String value, ContinuationImpl continuationImpl) {
        ServerApiImpl$getOdxListByName$1 serverApiImpl$getOdxListByName$1;
        Ya.a aVarSerializer;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getOdxListByName$1) {
            serverApiImpl$getOdxListByName$1 = (ServerApiImpl$getOdxListByName$1) continuationImpl;
            int i10 = serverApiImpl$getOdxListByName$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getOdxListByName$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getOdxListByName$1 = new ServerApiImpl$getOdxListByName$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getOdxListByName$1 = new ServerApiImpl$getOdxListByName$1(this, continuationImpl);
        }
        Object objE = serverApiImpl$getOdxListByName$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getOdxListByName$1.label;
        if (i11 == 0) {
            b.b(objE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i.e(value, "value");
            linkedHashMap.put("values", value);
            aVarSerializer = C2827f.Companion.serializer(Za.a.a(v.Companion.serializer()));
            String str = "where=" + B9.a.a(linkedHashMap) + "&limit=" + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            r rVar = this.f34433b;
            serverApiImpl$getOdxListByName$1.L$0 = rVar;
            serverApiImpl$getOdxListByName$1.L$1 = aVarSerializer;
            serverApiImpl$getOdxListByName$1.label = 1;
            objE = this.f34432a.e("ODX", str, serverApiImpl$getOdxListByName$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$getOdxListByName$1.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getOdxListByName$1.L$0;
            b.b(objE);
        }
        return ((C2827f) abstractC2184a.a(aVarSerializer, (String) objE)).f48559c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.sharednetwork.a
    public final Object x(ArrayList value, ContinuationImpl continuationImpl) {
        ServerApiImpl$getTextTableList$1 serverApiImpl$getTextTableList$1;
        Ya.a aVarSerializer;
        AbstractC2184a abstractC2184a;
        if (continuationImpl instanceof ServerApiImpl$getTextTableList$1) {
            serverApiImpl$getTextTableList$1 = (ServerApiImpl$getTextTableList$1) continuationImpl;
            int i10 = serverApiImpl$getTextTableList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$getTextTableList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$getTextTableList$1 = new ServerApiImpl$getTextTableList$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$getTextTableList$1 = new ServerApiImpl$getTextTableList$1(this, continuationImpl);
        }
        Object objE = serverApiImpl$getTextTableList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$getTextTableList$1.label;
        if (i11 == 0) {
            b.b(objE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i.e(value, "value");
            Map linkedHashMap2 = new LinkedHashMap();
            if (linkedHashMap.containsKey("objectId")) {
                Object obj = linkedHashMap.get("objectId");
                if (obj instanceof Map) {
                    linkedHashMap2 = kotlin.jvm.internal.o.c(obj);
                }
            }
            linkedHashMap2.put("$in", value);
            linkedHashMap.put("objectId", linkedHashMap2);
            aVarSerializer = C2827f.Companion.serializer(Za.a.a(G.Companion.serializer()));
            String str = "where=" + B9.a.a(linkedHashMap) + "&limit=" + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            r rVar = this.f34433b;
            serverApiImpl$getTextTableList$1.L$0 = rVar;
            serverApiImpl$getTextTableList$1.L$1 = aVarSerializer;
            serverApiImpl$getTextTableList$1.label = 1;
            objE = this.f34432a.e("Texttable", str, serverApiImpl$getTextTableList$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC2184a = rVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarSerializer = (Ya.a) serverApiImpl$getTextTableList$1.L$1;
            abstractC2184a = (AbstractC2184a) serverApiImpl$getTextTableList$1.L$0;
            b.b(objE);
        }
        return ((C2827f) abstractC2184a.a(aVarSerializer, (String) objE)).f48559c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object y(p316z9.k kVar, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$saveOriginalAppValue$1 serverApiImpl$saveOriginalAppValue$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$saveOriginalAppValue$1) {
            serverApiImpl$saveOriginalAppValue$1 = (ServerApiImpl$saveOriginalAppValue$1) continuationImpl;
            int i10 = serverApiImpl$saveOriginalAppValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$saveOriginalAppValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$saveOriginalAppValue$1 = new ServerApiImpl$saveOriginalAppValue$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$saveOriginalAppValue$1 = new ServerApiImpl$saveOriginalAppValue$1(this, continuationImpl);
        }
        ServerApiImpl$saveOriginalAppValue$1 serverApiImpl$saveOriginalAppValue$2 = serverApiImpl$saveOriginalAppValue$1;
        Object objA = serverApiImpl$saveOriginalAppValue$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$saveOriginalAppValue$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = this.f34433b.b(p316z9.k.Companion.serializer(), kVar);
            serverApiImpl$saveOriginalAppValue$2.L$0 = this;
            serverApiImpl$saveOriginalAppValue$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/createVagOcaOriginalValue", null, strB, null, serverApiImpl$saveOriginalAppValue$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$saveOriginalAppValue$2.L$0;
            b.b(objA);
        }
        p293xa.r rVar = p293xa.r.f47939a;
        i.e(rVar, "<this>");
        serverApiImpl.Q(O0.f22572b, ((z) objA).f48671b);
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.sharednetwork.a
    public final Object z(p316z9.c cVar, ContinuationImpl continuationImpl) throws Exception {
        ServerApiImpl$consumeDeviceBonus$1 serverApiImpl$consumeDeviceBonus$1;
        ServerApiImpl serverApiImpl;
        if (continuationImpl instanceof ServerApiImpl$consumeDeviceBonus$1) {
            serverApiImpl$consumeDeviceBonus$1 = (ServerApiImpl$consumeDeviceBonus$1) continuationImpl;
            int i10 = serverApiImpl$consumeDeviceBonus$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                serverApiImpl$consumeDeviceBonus$1.label = i10 - Integer.MIN_VALUE;
            } else {
                serverApiImpl$consumeDeviceBonus$1 = new ServerApiImpl$consumeDeviceBonus$1(this, continuationImpl);
            }
        } else {
            serverApiImpl$consumeDeviceBonus$1 = new ServerApiImpl$consumeDeviceBonus$1(this, continuationImpl);
        }
        ServerApiImpl$consumeDeviceBonus$1 serverApiImpl$consumeDeviceBonus$2 = serverApiImpl$consumeDeviceBonus$1;
        Object objA = serverApiImpl$consumeDeviceBonus$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = serverApiImpl$consumeDeviceBonus$2.label;
        if (i11 == 0) {
            b.b(objA);
            String strB = AbstractC2184a.f34641d.b(p316z9.c.Companion.serializer(), cVar);
            serverApiImpl$consumeDeviceBonus$2.L$0 = this;
            serverApiImpl$consumeDeviceBonus$2.label = 1;
            objA = com.voltasit.sharednetwork.dataSources.a.C0353a.a(this.f34432a, "functions/consumeDeviceBonus", null, strB, null, serverApiImpl$consumeDeviceBonus$2, 10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            serverApiImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverApiImpl = (ServerApiImpl) serverApiImpl$consumeDeviceBonus$2.L$0;
            b.b(objA);
        }
        serverApiImpl.Q(A9.f.Companion.serializer(), ((z) objA).f48671b);
        return p293xa.r.f47939a;
    }
}
