package com.voltasit.obdeleven.data.repositories;

import G8.D;
import G8.G;
import G8.H;
import Z3.C0835a;
import androidx.media3.exoplayer.E;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseFbHelper;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.exceptions.UserNotFoundException;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.utils.CreditUtils;
import com.voltasit.sharednetwork.domain.common.CloudException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;
import p255u9.z;
import p304y9.I;

/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UserRepositoryImpl implements K8.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.network.c f30313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.b f30314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F8.c f30315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F8.e f30316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f30317g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f30318h = kotlinx.coroutines.flow.w.b(0, 0, null, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.channels.a<Boolean> f30319i = kotlinx.coroutines.channels.b.a(1);
    public final kotlinx.coroutines.flow.v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f30320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StateFlowImpl f30321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StateFlowImpl f30322m;

    public UserRepositoryImpl(J8.p pVar, com.voltasit.sharednetwork.a aVar, com.voltasit.obdeleven.network.c cVar, K8.b bVar, F8.c cVar2, F8.e eVar) {
        this.f30311a = pVar;
        this.f30312b = aVar;
        this.f30313c = cVar;
        this.f30314d = bVar;
        this.f30315e = cVar2;
        this.f30316f = eVar;
        BufferOverflow bufferOverflow = BufferOverflow.f43244c;
        this.j = kotlinx.coroutines.flow.w.b(1, 0, bufferOverflow, 2);
        this.f30320k = kotlinx.coroutines.flow.w.b(1, 0, bufferOverflow, 2);
        SubscriptionType.a aVar2 = SubscriptionType.f30540b;
        StateFlowImpl stateFlowImplA = B.a(new D());
        this.f30321l = stateFlowImplA;
        this.f30322m = stateFlowImplA;
    }

    @Override // K8.v
    public final StateFlowImpl A() {
        return this.f30322m;
    }

    @Override // K8.v
    public final kotlinx.coroutines.flow.v B() {
        return this.f30318h;
    }

    @Override // K8.v
    public final boolean C(UserPermission... permissions) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        for (UserPermission userPermission : permissions) {
            if (this.f30317g.contains(userPermission)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object D(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$addFacebookAuthData$1 userRepositoryImpl$addFacebookAuthData$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$addFacebookAuthData$1) {
            userRepositoryImpl$addFacebookAuthData$1 = (UserRepositoryImpl$addFacebookAuthData$1) continuationImpl;
            int i10 = userRepositoryImpl$addFacebookAuthData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$addFacebookAuthData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$addFacebookAuthData$1 = new UserRepositoryImpl$addFacebookAuthData$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$addFacebookAuthData$1 = new UserRepositoryImpl$addFacebookAuthData$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$addFacebookAuthData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$addFacebookAuthData$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                p316z9.p pVar = new p316z9.p(new p316z9.f(new p316z9.g(str2, str3, str4)));
                userRepositoryImpl$addFacebookAuthData$1.L$0 = this;
                userRepositoryImpl$addFacebookAuthData$1.L$1 = str2;
                userRepositoryImpl$addFacebookAuthData$1.L$2 = str3;
                userRepositoryImpl$addFacebookAuthData$1.L$3 = str4;
                userRepositoryImpl$addFacebookAuthData$1.label = 1;
                if (aVar.I(str, pVar, userRepositoryImpl$addFacebookAuthData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) userRepositoryImpl$addFacebookAuthData$1.L$3;
            str3 = (String) userRepositoryImpl$addFacebookAuthData$1.L$2;
            str2 = (String) userRepositoryImpl$addFacebookAuthData$1.L$1;
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$addFacebookAuthData$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        ParseFbHelper.linkFb(userRepositoryImpl.L(), str2, str3, str4);
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object E(String str, ContinuationImpl continuationImpl) throws UserNotFoundException {
        UserRepositoryImpl$updateEmail$1 userRepositoryImpl$updateEmail$1;
        UserRepositoryImpl userRepositoryImpl;
        z zVar;
        Throwable th;
        String str2;
        if (continuationImpl instanceof UserRepositoryImpl$updateEmail$1) {
            userRepositoryImpl$updateEmail$1 = (UserRepositoryImpl$updateEmail$1) continuationImpl;
            int i10 = userRepositoryImpl$updateEmail$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$updateEmail$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$updateEmail$1 = new UserRepositoryImpl$updateEmail$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$updateEmail$1 = new UserRepositoryImpl$updateEmail$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$updateEmail$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$updateEmail$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            z zVarL = L();
            String email = zVarL.getEmail();
            try {
                zVarL.setEmail(str);
                zVarL.setUsername(str);
                Sa.a aVar = N.f43200c;
                UserRepositoryImpl$updateEmail$2 userRepositoryImpl$updateEmail$2 = new UserRepositoryImpl$updateEmail$2(zVarL, null);
                userRepositoryImpl$updateEmail$1.L$0 = this;
                userRepositoryImpl$updateEmail$1.L$1 = zVarL;
                userRepositoryImpl$updateEmail$1.L$2 = email;
                userRepositoryImpl$updateEmail$1.label = 1;
                if (C2680e.f(aVar, userRepositoryImpl$updateEmail$2, userRepositoryImpl$updateEmail$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
                zVar = zVarL;
                str2 = email;
            } catch (Throwable th2) {
                userRepositoryImpl = this;
                zVar = zVarL;
                th = th2;
                str2 = email;
                zVar.setEmail(str2);
                userRepositoryImpl.f30311a.d(th, false);
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) userRepositoryImpl$updateEmail$1.L$2;
            zVar = (z) userRepositoryImpl$updateEmail$1.L$1;
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$updateEmail$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zVar.setEmail(str2);
                userRepositoryImpl.f30311a.d(th, false);
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object F(ContinuationImpl continuationImpl) throws Throwable {
        UserRepositoryImpl$getUserFromServer$1 userRepositoryImpl$getUserFromServer$1;
        UserRepositoryImpl userRepositoryImpl;
        UserRepositoryImpl userRepositoryImpl2;
        ParseUser parseUser;
        if (continuationImpl instanceof UserRepositoryImpl$getUserFromServer$1) {
            userRepositoryImpl$getUserFromServer$1 = (UserRepositoryImpl$getUserFromServer$1) continuationImpl;
            int i10 = userRepositoryImpl$getUserFromServer$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$getUserFromServer$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$getUserFromServer$1 = new UserRepositoryImpl$getUserFromServer$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$getUserFromServer$1 = new UserRepositoryImpl$getUserFromServer$1(this, continuationImpl);
        }
        Object objF = userRepositoryImpl$getUserFromServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$getUserFromServer$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            this.f30311a.e("UserRepositoryImpl", "getUserFromServer()");
            int i12 = z.f47484b;
            z zVar = (z) ParseUser.getCurrentUser();
            if (zVar == null) {
                return new C8.a.C0024a(new CreditUtils.CreditsException());
            }
            try {
                Sa.a aVar = N.f43200c;
                UserRepositoryImpl$getUserFromServer$userFromServer$1 userRepositoryImpl$getUserFromServer$userFromServer$1 = new UserRepositoryImpl$getUserFromServer$userFromServer$1(zVar, null);
                userRepositoryImpl$getUserFromServer$1.L$0 = this;
                userRepositoryImpl$getUserFromServer$1.label = 1;
                objF = C2680e.f(aVar, userRepositoryImpl$getUserFromServer$userFromServer$1, userRepositoryImpl$getUserFromServer$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl2 = this;
            } catch (Exception e10) {
                e = e10;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(e));
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                parseUser = (ParseUser) userRepositoryImpl$getUserFromServer$1.L$1;
                userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$getUserFromServer$1.L$0;
                try {
                    kotlin.b.b(objF);
                    kotlin.jvm.internal.i.c(parseUser, "null cannot be cast to non-null type com.voltasit.parse.model.UserDB");
                    return new C8.a.b((z) parseUser);
                } catch (Exception e11) {
                    e = e11;
                    return E8.a.i(userRepositoryImpl.f30315e.a(e));
                }
            }
            userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$getUserFromServer$1.L$0;
            try {
                kotlin.b.b(objF);
            } catch (Exception e12) {
                e = e12;
                userRepositoryImpl = userRepositoryImpl2;
                return E8.a.i(userRepositoryImpl.f30315e.a(e));
            }
        }
        ParseUser parseUser2 = (ParseUser) objF;
        kotlinx.coroutines.flow.v vVar = userRepositoryImpl2.j;
        p293xa.r rVar = p293xa.r.f47939a;
        userRepositoryImpl$getUserFromServer$1.L$0 = userRepositoryImpl2;
        userRepositoryImpl$getUserFromServer$1.L$1 = parseUser2;
        userRepositoryImpl$getUserFromServer$1.label = 2;
        if (vVar.emit(rVar, userRepositoryImpl$getUserFromServer$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        parseUser = parseUser2;
        userRepositoryImpl = userRepositoryImpl2;
        kotlin.jvm.internal.i.c(parseUser, "null cannot be cast to non-null type com.voltasit.parse.model.UserDB");
        return new C8.a.b((z) parseUser);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [C8.a$a, T] */
    @Override // K8.v
    public final Object G(ContinuationImpl continuationImpl) {
        UserRepositoryImpl$getFacebookUserNameAndEmail$1 userRepositoryImpl$getFacebookUserNameAndEmail$1;
        UserRepositoryImpl userRepositoryImpl;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof UserRepositoryImpl$getFacebookUserNameAndEmail$1) {
            userRepositoryImpl$getFacebookUserNameAndEmail$1 = (UserRepositoryImpl$getFacebookUserNameAndEmail$1) continuationImpl;
            int i10 = userRepositoryImpl$getFacebookUserNameAndEmail$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$getFacebookUserNameAndEmail$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$getFacebookUserNameAndEmail$1 = new UserRepositoryImpl$getFacebookUserNameAndEmail$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$getFacebookUserNameAndEmail$1 = new UserRepositoryImpl$getFacebookUserNameAndEmail$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$getFacebookUserNameAndEmail$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$getFacebookUserNameAndEmail$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) userRepositoryImpl$getFacebookUserNameAndEmail$1.L$1;
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$getFacebookUserNameAndEmail$1.L$0;
            try {
                kotlin.b.b(obj);
                return ref$ObjectRef.element;
            } catch (Throwable th) {
                th = th;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new C8.a.C0024a(new Exception("Can't get user name or email from FB"));
        String str = Z3.r.j;
        Date date = C0835a.f7782m;
        Z3.r rVarH = Z3.r.c.h(C0835a.b.b(), new E(3, ref$ObjectRef2));
        rVarH.f7876d = C4.v.d("fields", "name,email");
        try {
            Sa.a aVar = N.f43200c;
            UserRepositoryImpl$getFacebookUserNameAndEmail$2 userRepositoryImpl$getFacebookUserNameAndEmail$2 = new UserRepositoryImpl$getFacebookUserNameAndEmail$2(rVarH, null);
            userRepositoryImpl$getFacebookUserNameAndEmail$1.L$0 = this;
            userRepositoryImpl$getFacebookUserNameAndEmail$1.L$1 = ref$ObjectRef2;
            userRepositoryImpl$getFacebookUserNameAndEmail$1.label = 1;
            if (C2680e.f(aVar, userRepositoryImpl$getFacebookUserNameAndEmail$2, userRepositoryImpl$getFacebookUserNameAndEmail$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            return ref$ObjectRef.element;
        } catch (Throwable th2) {
            th = th2;
            userRepositoryImpl = this;
            return E8.a.i(userRepositoryImpl.f30315e.a(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Serializable H(ContinuationImpl continuationImpl) {
        UserRepositoryImpl$shouldRedirectToMainApp$1 userRepositoryImpl$shouldRedirectToMainApp$1;
        UserRepositoryImpl userRepositoryImpl;
        Serializable serializableA;
        if (continuationImpl instanceof UserRepositoryImpl$shouldRedirectToMainApp$1) {
            userRepositoryImpl$shouldRedirectToMainApp$1 = (UserRepositoryImpl$shouldRedirectToMainApp$1) continuationImpl;
            int i10 = userRepositoryImpl$shouldRedirectToMainApp$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$shouldRedirectToMainApp$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$shouldRedirectToMainApp$1 = new UserRepositoryImpl$shouldRedirectToMainApp$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$shouldRedirectToMainApp$1 = new UserRepositoryImpl$shouldRedirectToMainApp$1(this, continuationImpl);
        }
        Object objG = userRepositoryImpl$shouldRedirectToMainApp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$shouldRedirectToMainApp$1.label;
        if (i11 == 0) {
            kotlin.b.b(objG);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$shouldRedirectToMainApp$1.L$0 = this;
                userRepositoryImpl$shouldRedirectToMainApp$1.label = 1;
                objG = aVar.G(userRepositoryImpl$shouldRedirectToMainApp$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                serializableA = kotlin.b.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$shouldRedirectToMainApp$1.L$0;
            try {
                kotlin.b.b(objG);
            } catch (Throwable th2) {
                th = th2;
                serializableA = kotlin.b.a(th);
            }
        }
        serializableA = Boolean.valueOf(((A9.n) objG).f1025a);
        Throwable thA = Result.a(serializableA);
        if (thA != null) {
            userRepositoryImpl.f30311a.d(thA, false);
        }
        return serializableA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object I(ContinuationImpl continuationImpl) {
        UserRepositoryImpl$sendSmsOtp$1 userRepositoryImpl$sendSmsOtp$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$sendSmsOtp$1) {
            userRepositoryImpl$sendSmsOtp$1 = (UserRepositoryImpl$sendSmsOtp$1) continuationImpl;
            int i10 = userRepositoryImpl$sendSmsOtp$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$sendSmsOtp$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$sendSmsOtp$1 = new UserRepositoryImpl$sendSmsOtp$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$sendSmsOtp$1 = new UserRepositoryImpl$sendSmsOtp$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$sendSmsOtp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$sendSmsOtp$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.obdeleven.network.c cVar = this.f30313c;
                userRepositoryImpl$sendSmsOtp$1.L$0 = this;
                userRepositoryImpl$sendSmsOtp$1.label = 1;
                if (cVar.e(userRepositoryImpl$sendSmsOtp$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$sendSmsOtp$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(th);
            }
        }
        return E8.a.j(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object J(String str, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$removeFacebookAuthData$1 userRepositoryImpl$removeFacebookAuthData$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$removeFacebookAuthData$1) {
            userRepositoryImpl$removeFacebookAuthData$1 = (UserRepositoryImpl$removeFacebookAuthData$1) continuationImpl;
            int i10 = userRepositoryImpl$removeFacebookAuthData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$removeFacebookAuthData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$removeFacebookAuthData$1 = new UserRepositoryImpl$removeFacebookAuthData$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$removeFacebookAuthData$1 = new UserRepositoryImpl$removeFacebookAuthData$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$removeFacebookAuthData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$removeFacebookAuthData$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                p316z9.p pVar = new p316z9.p(new p316z9.f(null));
                userRepositoryImpl$removeFacebookAuthData$1.L$0 = this;
                userRepositoryImpl$removeFacebookAuthData$1.label = 1;
                if (aVar.I(str, pVar, userRepositoryImpl$removeFacebookAuthData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$removeFacebookAuthData$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        ParseFbHelper.unlinkFb(userRepositoryImpl.L());
        return new C8.a.b(p293xa.r.f47939a);
    }

    @Override // K8.v
    public final D K() {
        p279w9.a aVar = p279w9.a.f47806c;
        K8.b bVar = this.f30314d;
        Object objC = bVar.c(aVar, true);
        if (bVar.m()) {
            C2680e.c(C2673a0.f43223b, null, null, new UserRepositoryImpl$getCachedUserDetails$1(this, null), 3);
        }
        if (!(objC instanceof A9.p)) {
            SubscriptionType.a aVar2 = SubscriptionType.f30540b;
            return new D();
        }
        A9.p input = (A9.p) objC;
        kotlin.jvm.internal.i.e(input, "input");
        SubscriptionType.f30540b.getClass();
        SubscriptionType subscriptionTypeA = SubscriptionType.a.a(input.f1030a);
        String str = input.f1031b;
        if (str == null) {
            str = "";
        }
        return new D(subscriptionTypeA, str, input.f1034e);
    }

    @Override // K8.v
    public final z L() throws UserNotFoundException {
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar != null) {
            return zVar;
        }
        throw UserNotFoundException.f30437b;
    }

    @Override // K8.v
    public final kotlinx.coroutines.flow.v M() {
        return this.f30320k;
    }

    @Override // K8.v
    public final Object N(kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Sa.b bVar = N.f43198a;
        Object objF = C2680e.f(kotlinx.coroutines.internal.q.f43500a, new UserRepositoryImpl$logout$2(this, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }

    @Override // K8.v
    public final kotlinx.coroutines.flow.v O() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // K8.v
    public final Object P(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$logIn$1 userRepositoryImpl$logIn$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$logIn$1) {
            userRepositoryImpl$logIn$1 = (UserRepositoryImpl$logIn$1) continuationImpl;
            int i10 = userRepositoryImpl$logIn$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$logIn$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$logIn$1 = new UserRepositoryImpl$logIn$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$logIn$1 = new UserRepositoryImpl$logIn$1(this, continuationImpl);
        }
        Object objS = userRepositoryImpl$logIn$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$logIn$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    UserRepositoryImpl userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$logIn$1.L$0;
                    kotlin.b.b(objS);
                    userRepositoryImpl = userRepositoryImpl2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    UserRepositoryImpl userRepositoryImpl3 = (UserRepositoryImpl) userRepositoryImpl$logIn$1.L$0;
                    kotlin.b.b(objS);
                    str = userRepositoryImpl3;
                }
                kotlin.jvm.internal.i.c(objS, "null cannot be cast to non-null type com.voltasit.parse.model.UserDB");
                return new C8.a.b((z) objS);
            }
            kotlin.b.b(objS);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                p316z9.e eVar = new p316z9.e(str, str2, str3, str4);
                userRepositoryImpl$logIn$1.L$0 = this;
                userRepositoryImpl$logIn$1.label = 1;
                objS = aVar.s(eVar, userRepositoryImpl$logIn$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                str = this;
                str.f30311a.d(th, false);
                return new C8.a.C0024a(str.f30315e.a(th));
            }
            Task<ParseUser> taskBecomeInBackground = ParseUser.becomeInBackground(((I) objS).f48494E);
            kotlin.jvm.internal.i.d(taskBecomeInBackground, "becomeInBackground(...)");
            userRepositoryImpl$logIn$1.L$0 = userRepositoryImpl;
            userRepositoryImpl$logIn$1.label = 2;
            objS = ParseTaskExtensionsKt.b(taskBecomeInBackground, userRepositoryImpl$logIn$1);
            str = userRepositoryImpl;
            if (objS == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlin.jvm.internal.i.c(objS, "null cannot be cast to non-null type com.voltasit.parse.model.UserDB");
            return new C8.a.b((z) objS);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z10, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$getUserDetails$2 userRepositoryImpl$getUserDetails$2;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$getUserDetails$2) {
            userRepositoryImpl$getUserDetails$2 = (UserRepositoryImpl$getUserDetails$2) continuationImpl;
            int i10 = userRepositoryImpl$getUserDetails$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$getUserDetails$2.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$getUserDetails$2 = new UserRepositoryImpl$getUserDetails$2(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$getUserDetails$2 = new UserRepositoryImpl$getUserDetails$2(this, continuationImpl);
        }
        Object objC = userRepositoryImpl$getUserDetails$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$getUserDetails$2.label;
        p279w9.a aVar = p279w9.a.f47806c;
        String str = "";
        if (i11 == 0) {
            kotlin.b.b(objC);
            this.f30311a.f("UserRepositoryImpl", "getUserDetails(useCache=" + z10 + ")");
            K8.b bVar = this.f30314d;
            if (!z10) {
                bVar.g(aVar);
            }
            try {
                Object objC2 = bVar.c(aVar, false);
                A9.p pVar = objC2 instanceof A9.p ? (A9.p) objC2 : null;
                if (z10 && pVar != null) {
                    try {
                        SubscriptionType.a aVar2 = SubscriptionType.f30540b;
                        String str2 = pVar.f1030a;
                        aVar2.getClass();
                        SubscriptionType subscriptionTypeA = SubscriptionType.a.a(str2);
                        String str3 = pVar.f1031b;
                        if (str3 != null) {
                            str = str3;
                        }
                        return new C8.a.b(new G8.E(new D(subscriptionTypeA, str, pVar.f1034e), new G8.t(pVar.f1032c, pVar.f1033d)));
                    } catch (Throwable th) {
                        th = th;
                        userRepositoryImpl = this;
                        userRepositoryImpl.f30311a.d(th, false);
                        return new C8.a.C0024a(userRepositoryImpl.f30315e.a(th));
                    }
                }
                com.voltasit.sharednetwork.a aVar3 = this.f30312b;
                userRepositoryImpl$getUserDetails$2.L$0 = this;
                userRepositoryImpl$getUserDetails$2.label = 1;
                objC = aVar3.C(userRepositoryImpl$getUserDetails$2);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$getUserDetails$2.L$0;
            try {
                kotlin.b.b(objC);
            } catch (Throwable th3) {
                th = th3;
                userRepositoryImpl.f30311a.d(th, false);
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(th));
            }
        }
        A9.p pVar2 = (A9.p) objC;
        userRepositoryImpl.f30314d.j(aVar, pVar2);
        SubscriptionType.a aVar4 = SubscriptionType.f30540b;
        String str4 = pVar2.f1030a;
        aVar4.getClass();
        SubscriptionType subscriptionTypeA2 = SubscriptionType.a.a(str4);
        String str5 = pVar2.f1031b;
        if (str5 != null) {
            str = str5;
        }
        return new C8.a.b(new G8.E(new D(subscriptionTypeA2, str, pVar2.f1034e), new G8.t(pVar2.f1032c, pVar2.f1033d)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object d(p316z9.q qVar, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$updatePersonalInfo$1 userRepositoryImpl$updatePersonalInfo$1;
        UserRepositoryImpl userRepositoryImpl;
        UserRepositoryImpl userRepositoryImpl2;
        G g10;
        if (continuationImpl instanceof UserRepositoryImpl$updatePersonalInfo$1) {
            userRepositoryImpl$updatePersonalInfo$1 = (UserRepositoryImpl$updatePersonalInfo$1) continuationImpl;
            int i10 = userRepositoryImpl$updatePersonalInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$updatePersonalInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$updatePersonalInfo$1 = new UserRepositoryImpl$updatePersonalInfo$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$updatePersonalInfo$1 = new UserRepositoryImpl$updatePersonalInfo$1(this, continuationImpl);
        }
        Object objD = userRepositoryImpl$updatePersonalInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$updatePersonalInfo$1.label;
        if (i11 == 0) {
            kotlin.b.b(objD);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$updatePersonalInfo$1.L$0 = this;
                userRepositoryImpl$updatePersonalInfo$1.label = 1;
                objD = aVar.d(qVar, userRepositoryImpl$updatePersonalInfo$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl2 = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g10 = (G) userRepositoryImpl$updatePersonalInfo$1.L$1;
                userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$updatePersonalInfo$1.L$0;
                try {
                    kotlin.b.b(objD);
                    return new C8.a.b(g10);
                } catch (Throwable th2) {
                    th = th2;
                    userRepositoryImpl.f30311a.d(th, false);
                    return E8.a.i(userRepositoryImpl.f30315e.a(th));
                }
            }
            userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$updatePersonalInfo$1.L$0;
            try {
                kotlin.b.b(objD);
            } catch (Throwable th3) {
                userRepositoryImpl = userRepositoryImpl2;
                th = th3;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        G gA = userRepositoryImpl2.f30316f.a((p316z9.q) objD);
        kotlinx.coroutines.flow.v vVar = userRepositoryImpl2.f30320k;
        userRepositoryImpl$updatePersonalInfo$1.L$0 = userRepositoryImpl2;
        userRepositoryImpl$updatePersonalInfo$1.L$1 = gA;
        userRepositoryImpl$updatePersonalInfo$1.label = 2;
        if (vVar.emit(gA, userRepositoryImpl$updatePersonalInfo$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        userRepositoryImpl = userRepositoryImpl2;
        g10 = gA;
        return new C8.a.b(g10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:20:0x0041, B:29:0x0059, B:31:0x0061, B:33:0x006e), top: B:48:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #2 {all -> 0x0045, blocks: (B:20:0x0041, B:29:0x0059, B:31:0x0061, B:33:0x006e), top: B:48:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object h(ContinuationImpl continuationImpl) {
        UserRepositoryImpl$getPersonalInfo$1 userRepositoryImpl$getPersonalInfo$1;
        UserRepositoryImpl userRepositoryImpl;
        UserRepositoryImpl userRepositoryImpl2;
        List list;
        G gA;
        kotlinx.coroutines.flow.v vVar;
        G g10;
        if (continuationImpl instanceof UserRepositoryImpl$getPersonalInfo$1) {
            userRepositoryImpl$getPersonalInfo$1 = (UserRepositoryImpl$getPersonalInfo$1) continuationImpl;
            int i10 = userRepositoryImpl$getPersonalInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$getPersonalInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$getPersonalInfo$1 = new UserRepositoryImpl$getPersonalInfo$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$getPersonalInfo$1 = new UserRepositoryImpl$getPersonalInfo$1(this, continuationImpl);
        }
        Object objH = userRepositoryImpl$getPersonalInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$getPersonalInfo$1.label;
        if (i11 == 0) {
            kotlin.b.b(objH);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$getPersonalInfo$1.L$0 = this;
                userRepositoryImpl$getPersonalInfo$1.label = 1;
                objH = aVar.h(userRepositoryImpl$getPersonalInfo$1);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl2 = this;
                list = (List) objH;
                if (list.isEmpty()) {
                    return new C8.a.C0024a(new NotFoundException("User personal info"));
                }
                gA = userRepositoryImpl2.f30316f.a((p316z9.q) list.get(0));
                vVar = userRepositoryImpl2.f30320k;
                userRepositoryImpl$getPersonalInfo$1.L$0 = userRepositoryImpl2;
                userRepositoryImpl$getPersonalInfo$1.L$1 = gA;
                userRepositoryImpl$getPersonalInfo$1.label = 2;
                if (vVar.emit(gA, userRepositoryImpl$getPersonalInfo$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g10 = gA;
                userRepositoryImpl = userRepositoryImpl2;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else if (i11 == 1) {
            userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$getPersonalInfo$1.L$0;
            try {
                kotlin.b.b(objH);
                list = (List) objH;
                if (list.isEmpty()) {
                    return new C8.a.C0024a(new NotFoundException("User personal info"));
                }
                gA = userRepositoryImpl2.f30316f.a((p316z9.q) list.get(0));
                vVar = userRepositoryImpl2.f30320k;
                userRepositoryImpl$getPersonalInfo$1.L$0 = userRepositoryImpl2;
                userRepositoryImpl$getPersonalInfo$1.L$1 = gA;
                userRepositoryImpl$getPersonalInfo$1.label = 2;
                if (vVar.emit(gA, userRepositoryImpl$getPersonalInfo$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g10 = gA;
                userRepositoryImpl = userRepositoryImpl2;
            } catch (Throwable th2) {
                th = th2;
                userRepositoryImpl = userRepositoryImpl2;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g10 = (G) userRepositoryImpl$getPersonalInfo$1.L$1;
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$getPersonalInfo$1.L$0;
            try {
                kotlin.b.b(objH);
            } catch (Throwable th3) {
                th = th3;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(g10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object j(String str, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$disable2FaBackupCode$1 userRepositoryImpl$disable2FaBackupCode$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$disable2FaBackupCode$1) {
            userRepositoryImpl$disable2FaBackupCode$1 = (UserRepositoryImpl$disable2FaBackupCode$1) continuationImpl;
            int i10 = userRepositoryImpl$disable2FaBackupCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$disable2FaBackupCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$disable2FaBackupCode$1 = new UserRepositoryImpl$disable2FaBackupCode$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$disable2FaBackupCode$1 = new UserRepositoryImpl$disable2FaBackupCode$1(this, continuationImpl);
        }
        Object objJ = userRepositoryImpl$disable2FaBackupCode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$disable2FaBackupCode$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$disable2FaBackupCode$1.L$0 = this;
                userRepositoryImpl$disable2FaBackupCode$1.label = 1;
                objJ = aVar.j(str, userRepositoryImpl$disable2FaBackupCode$1);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (CloudException.UnknownCloudException e10) {
                e = e10;
                userRepositoryImpl = this;
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(e));
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$disable2FaBackupCode$1.L$0;
            try {
                kotlin.b.b(objJ);
            } catch (CloudException.UnknownCloudException e11) {
                e = e11;
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(e));
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(objJ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object m(String str, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$verify2FaCode$1 userRepositoryImpl$verify2FaCode$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$verify2FaCode$1) {
            userRepositoryImpl$verify2FaCode$1 = (UserRepositoryImpl$verify2FaCode$1) continuationImpl;
            int i10 = userRepositoryImpl$verify2FaCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$verify2FaCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$verify2FaCode$1 = new UserRepositoryImpl$verify2FaCode$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$verify2FaCode$1 = new UserRepositoryImpl$verify2FaCode$1(this, continuationImpl);
        }
        Object objM = userRepositoryImpl$verify2FaCode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$verify2FaCode$1.label;
        if (i11 == 0) {
            kotlin.b.b(objM);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$verify2FaCode$1.L$0 = this;
                userRepositoryImpl$verify2FaCode$1.label = 1;
                objM = aVar.m(str, userRepositoryImpl$verify2FaCode$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$verify2FaCode$1.L$0;
            try {
                kotlin.b.b(objM);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(((A9.q) objM).f1036a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object n(String str, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$disable2Fa$1 userRepositoryImpl$disable2Fa$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$disable2Fa$1) {
            userRepositoryImpl$disable2Fa$1 = (UserRepositoryImpl$disable2Fa$1) continuationImpl;
            int i10 = userRepositoryImpl$disable2Fa$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$disable2Fa$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$disable2Fa$1 = new UserRepositoryImpl$disable2Fa$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$disable2Fa$1 = new UserRepositoryImpl$disable2Fa$1(this, continuationImpl);
        }
        Object objN = userRepositoryImpl$disable2Fa$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$disable2Fa$1.label;
        if (i11 == 0) {
            kotlin.b.b(objN);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$disable2Fa$1.L$0 = this;
                userRepositoryImpl$disable2Fa$1.label = 1;
                objN = aVar.n(str, userRepositoryImpl$disable2Fa$1);
                if (objN == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (CloudException.UnknownCloudException e10) {
                e = e10;
                userRepositoryImpl = this;
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(e));
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$disable2Fa$1.L$0;
            try {
                kotlin.b.b(objN);
            } catch (CloudException.UnknownCloudException e11) {
                e = e11;
                return new C8.a.C0024a(userRepositoryImpl.f30315e.a(e));
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(objN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // K8.v
    public final Object o(String str, String str2, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$updatePhoneNumber$1 userRepositoryImpl$updatePhoneNumber$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$updatePhoneNumber$1) {
            userRepositoryImpl$updatePhoneNumber$1 = (UserRepositoryImpl$updatePhoneNumber$1) continuationImpl;
            int i10 = userRepositoryImpl$updatePhoneNumber$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$updatePhoneNumber$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$updatePhoneNumber$1 = new UserRepositoryImpl$updatePhoneNumber$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$updatePhoneNumber$1 = new UserRepositoryImpl$updatePhoneNumber$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$updatePhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$updatePhoneNumber$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                try {
                    com.voltasit.obdeleven.network.c cVar = this.f30313c;
                    userRepositoryImpl$updatePhoneNumber$1.L$0 = this;
                    userRepositoryImpl$updatePhoneNumber$1.label = 1;
                    if (cVar.c(str, str2, userRepositoryImpl$updatePhoneNumber$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userRepositoryImpl = this;
                } catch (Throwable th) {
                    th = th;
                    str2 = this;
                    str2.f30311a.d(th, false);
                    return E8.a.i(str2.f30315e.a(th));
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C8.a.b bVar = (C8.a.b) userRepositoryImpl$updatePhoneNumber$1.L$1;
                    kotlin.b.b(obj);
                    return bVar;
                }
                userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$updatePhoneNumber$1.L$0;
                kotlin.b.b(obj);
            }
            C8.a.b bVarJ = E8.a.j(p293xa.r.f47939a);
            userRepositoryImpl$updatePhoneNumber$1.L$0 = userRepositoryImpl;
            userRepositoryImpl$updatePhoneNumber$1.L$1 = bVarJ;
            userRepositoryImpl$updatePhoneNumber$1.label = 2;
            return userRepositoryImpl.h(userRepositoryImpl$updatePhoneNumber$1) == coroutineSingletons ? coroutineSingletons : bVarJ;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // K8.v
    public final Object p(String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$loginWithFacebook$1 userRepositoryImpl$loginWithFacebook$1;
        UserRepositoryImpl userRepositoryImpl;
        A9.e eVar;
        UserRepositoryImpl userRepositoryImpl2;
        kotlinx.coroutines.flow.v vVar;
        Boolean bool;
        if (continuationImpl instanceof UserRepositoryImpl$loginWithFacebook$1) {
            userRepositoryImpl$loginWithFacebook$1 = (UserRepositoryImpl$loginWithFacebook$1) continuationImpl;
            int i10 = userRepositoryImpl$loginWithFacebook$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$loginWithFacebook$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$loginWithFacebook$1 = new UserRepositoryImpl$loginWithFacebook$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$loginWithFacebook$1 = new UserRepositoryImpl$loginWithFacebook$1(this, continuationImpl);
        }
        Object objA = userRepositoryImpl$loginWithFacebook$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$loginWithFacebook$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    UserRepositoryImpl userRepositoryImpl3 = (UserRepositoryImpl) userRepositoryImpl$loginWithFacebook$1.L$0;
                    kotlin.b.b(objA);
                    userRepositoryImpl = userRepositoryImpl3;
                } else if (i11 == 2) {
                    eVar = (A9.e) userRepositoryImpl$loginWithFacebook$1.L$1;
                    UserRepositoryImpl userRepositoryImpl4 = (UserRepositoryImpl) userRepositoryImpl$loginWithFacebook$1.L$0;
                    kotlin.b.b(objA);
                    userRepositoryImpl2 = userRepositoryImpl4;
                    vVar = userRepositoryImpl2.f30318h;
                    bool = Boolean.TRUE;
                    userRepositoryImpl$loginWithFacebook$1.L$0 = userRepositoryImpl2;
                    userRepositoryImpl$loginWithFacebook$1.L$1 = eVar;
                    userRepositoryImpl$loginWithFacebook$1.label = 3;
                    str2 = userRepositoryImpl2;
                    if (vVar.emit(bool, userRepositoryImpl$loginWithFacebook$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (A9.e) userRepositoryImpl$loginWithFacebook$1.L$1;
                    UserRepositoryImpl userRepositoryImpl5 = (UserRepositoryImpl) userRepositoryImpl$loginWithFacebook$1.L$0;
                    kotlin.b.b(objA);
                    str2 = userRepositoryImpl5;
                }
                return new C8.a.b(new G8.q(eVar.f1000a));
            }
            kotlin.b.b(objA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str6 != null) {
                linkedHashMap.put("temporary-password", str6);
            }
            if (str7 != null) {
                linkedHashMap.put("backup-code", str7);
            }
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                p316z9.n nVar = new p316z9.n(new p316z9.f(new p316z9.g(str, str2, str3)), str4, str5, str5);
                userRepositoryImpl$loginWithFacebook$1.L$0 = this;
                userRepositoryImpl$loginWithFacebook$1.label = 1;
                objA = aVar.A(nVar, linkedHashMap, userRepositoryImpl$loginWithFacebook$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (CloudException.ParseNotFoundException e10) {
                e = e10;
                str2 = this;
                return new C8.a.C0024a(str2.f30315e.a(e));
            } catch (CloudException.UnknownCloudException e11) {
                e = e11;
                str2 = this;
                return new C8.a.C0024a(str2.f30315e.a(e));
            } catch (Throwable th) {
                th = th;
                str2 = this;
                str2.f30311a.d(th, false);
                return E8.a.i(str2.f30315e.a(th));
            }
            A9.e eVar2 = (A9.e) objA;
            Sa.a aVar2 = N.f43200c;
            UserRepositoryImpl$loginWithFacebook$4 userRepositoryImpl$loginWithFacebook$4 = new UserRepositoryImpl$loginWithFacebook$4(eVar2, null);
            userRepositoryImpl$loginWithFacebook$1.L$0 = userRepositoryImpl;
            userRepositoryImpl$loginWithFacebook$1.L$1 = eVar2;
            userRepositoryImpl$loginWithFacebook$1.label = 2;
            if (C2680e.f(aVar2, userRepositoryImpl$loginWithFacebook$4, userRepositoryImpl$loginWithFacebook$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
            userRepositoryImpl2 = userRepositoryImpl;
            vVar = userRepositoryImpl2.f30318h;
            bool = Boolean.TRUE;
            userRepositoryImpl$loginWithFacebook$1.L$0 = userRepositoryImpl2;
            userRepositoryImpl$loginWithFacebook$1.L$1 = eVar;
            userRepositoryImpl$loginWithFacebook$1.label = 3;
            str2 = userRepositoryImpl2;
            if (vVar.emit(bool, userRepositoryImpl$loginWithFacebook$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return new C8.a.b(new G8.q(eVar.f1000a));
        } catch (CloudException.ParseNotFoundException e12) {
            e = e12;
        } catch (CloudException.UnknownCloudException e13) {
            e = e13;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // K8.v
    public final Object q(boolean z10, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$updateUserDetails$1 userRepositoryImpl$updateUserDetails$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$updateUserDetails$1) {
            userRepositoryImpl$updateUserDetails$1 = (UserRepositoryImpl$updateUserDetails$1) continuationImpl;
            int i10 = userRepositoryImpl$updateUserDetails$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$updateUserDetails$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$updateUserDetails$1 = new UserRepositoryImpl$updateUserDetails$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$updateUserDetails$1 = new UserRepositoryImpl$updateUserDetails$1(this, continuationImpl);
        }
        Object objA = userRepositoryImpl$updateUserDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$updateUserDetails$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$updateUserDetails$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return new C8.a.b(p293xa.r.f47939a);
        }
        kotlin.b.b(objA);
        userRepositoryImpl$updateUserDetails$1.L$0 = this;
        userRepositoryImpl$updateUserDetails$1.label = 1;
        objA = a(z10, userRepositoryImpl$updateUserDetails$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        userRepositoryImpl = this;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return E8.a.i(userRepositoryImpl.f30315e.a(((C8.a.C0024a) aVar).f2462a));
            }
            throw new NoWhenBranchMatchedException();
        }
        StateFlowImpl stateFlowImpl = userRepositoryImpl.f30321l;
        D d10 = ((G8.E) ((C8.a.b) aVar).f2463a).f3413a;
        userRepositoryImpl$updateUserDetails$1.L$0 = null;
        userRepositoryImpl$updateUserDetails$1.label = 2;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, d10);
        if (p293xa.r.f47939a == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object r(ContinuationImpl continuationImpl) {
        UserRepositoryImpl$generateTwoFactorAuthKey$1 userRepositoryImpl$generateTwoFactorAuthKey$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$generateTwoFactorAuthKey$1) {
            userRepositoryImpl$generateTwoFactorAuthKey$1 = (UserRepositoryImpl$generateTwoFactorAuthKey$1) continuationImpl;
            int i10 = userRepositoryImpl$generateTwoFactorAuthKey$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$generateTwoFactorAuthKey$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$generateTwoFactorAuthKey$1 = new UserRepositoryImpl$generateTwoFactorAuthKey$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$generateTwoFactorAuthKey$1 = new UserRepositoryImpl$generateTwoFactorAuthKey$1(this, continuationImpl);
        }
        Object objP = userRepositoryImpl$generateTwoFactorAuthKey$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$generateTwoFactorAuthKey$1.label;
        if (i11 == 0) {
            kotlin.b.b(objP);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                userRepositoryImpl$generateTwoFactorAuthKey$1.L$0 = this;
                userRepositoryImpl$generateTwoFactorAuthKey$1.label = 1;
                objP = aVar.P(userRepositoryImpl$generateTwoFactorAuthKey$1);
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$generateTwoFactorAuthKey$1.L$0;
            try {
                kotlin.b.b(objP);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(((A9.d) objP).f998a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object s(String str, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$confirmPhoneNumber$1 userRepositoryImpl$confirmPhoneNumber$1;
        UserRepositoryImpl userRepositoryImpl;
        UserRepositoryImpl userRepositoryImpl2;
        C8.a.b bVarJ;
        if (continuationImpl instanceof UserRepositoryImpl$confirmPhoneNumber$1) {
            userRepositoryImpl$confirmPhoneNumber$1 = (UserRepositoryImpl$confirmPhoneNumber$1) continuationImpl;
            int i10 = userRepositoryImpl$confirmPhoneNumber$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$confirmPhoneNumber$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$confirmPhoneNumber$1 = new UserRepositoryImpl$confirmPhoneNumber$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$confirmPhoneNumber$1 = new UserRepositoryImpl$confirmPhoneNumber$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$confirmPhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$confirmPhoneNumber$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.obdeleven.network.c cVar = this.f30313c;
                userRepositoryImpl$confirmPhoneNumber$1.L$0 = this;
                userRepositoryImpl$confirmPhoneNumber$1.label = 1;
                if (cVar.a(str, userRepositoryImpl$confirmPhoneNumber$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl2 = this;
                bVarJ = E8.a.j(p293xa.r.f47939a);
                userRepositoryImpl$confirmPhoneNumber$1.L$0 = userRepositoryImpl2;
                userRepositoryImpl$confirmPhoneNumber$1.L$1 = bVarJ;
                userRepositoryImpl$confirmPhoneNumber$1.label = 2;
                if (userRepositoryImpl2.h(userRepositoryImpl$confirmPhoneNumber$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return bVarJ;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(th);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8.a.b bVar = (C8.a.b) userRepositoryImpl$confirmPhoneNumber$1.L$1;
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$confirmPhoneNumber$1.L$0;
            try {
                kotlin.b.b(obj);
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(th);
            }
        }
        userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$confirmPhoneNumber$1.L$0;
        try {
            kotlin.b.b(obj);
            bVarJ = E8.a.j(p293xa.r.f47939a);
            userRepositoryImpl$confirmPhoneNumber$1.L$0 = userRepositoryImpl2;
            userRepositoryImpl$confirmPhoneNumber$1.L$1 = bVarJ;
            userRepositoryImpl$confirmPhoneNumber$1.label = 2;
            if (userRepositoryImpl2.h(userRepositoryImpl$confirmPhoneNumber$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return bVarJ;
        } catch (Throwable th3) {
            userRepositoryImpl = userRepositoryImpl2;
            th = th3;
            userRepositoryImpl.f30311a.d(th, false);
            return E8.a.i(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object t(H h8, ContinuationImpl continuationImpl) throws UserNotFoundException {
        UserRepositoryImpl$removeVehicle$1 userRepositoryImpl$removeVehicle$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$removeVehicle$1) {
            userRepositoryImpl$removeVehicle$1 = (UserRepositoryImpl$removeVehicle$1) continuationImpl;
            int i10 = userRepositoryImpl$removeVehicle$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$removeVehicle$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$removeVehicle$1 = new UserRepositoryImpl$removeVehicle$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$removeVehicle$1 = new UserRepositoryImpl$removeVehicle$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$removeVehicle$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$removeVehicle$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            z zVarL = L();
            p255u9.E e10 = new p255u9.E();
            e10.setObjectId(h8.f3427a);
            zVarL.b().remove(e10);
            Application.f29634b.d();
            try {
                Sa.a aVar = N.f43200c;
                UserRepositoryImpl$removeVehicle$2 userRepositoryImpl$removeVehicle$2 = new UserRepositoryImpl$removeVehicle$2(zVarL, null);
                userRepositoryImpl$removeVehicle$1.L$0 = this;
                userRepositoryImpl$removeVehicle$1.label = 1;
                if (C2680e.f(aVar, userRepositoryImpl$removeVehicle$2, userRepositoryImpl$removeVehicle$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (ParseException e11) {
                e = e11;
                userRepositoryImpl = this;
                return E8.a.i(userRepositoryImpl.f30315e.a(e));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$removeVehicle$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (ParseException e12) {
                e = e12;
                return E8.a.i(userRepositoryImpl.f30315e.a(e));
            }
        }
        return new C8.a.b(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.v
    public final Object u(SubscriptionType subscriptionType, ContinuationImpl continuationImpl) {
        UserRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1 userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1;
        UserRepositoryImpl userRepositoryImpl;
        if (continuationImpl instanceof UserRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1) {
            userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1 = (UserRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1) continuationImpl;
            int i10 = userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1 = new UserRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1(this, continuationImpl);
            }
        } else {
            userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1 = new UserRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1(this, continuationImpl);
        }
        Object obj = userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30312b;
                p316z9.o oVar = new p316z9.o(subscriptionType.b());
                userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.L$0 = this;
                userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.label = 1;
                if (aVar.H(oVar, userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                userRepositoryImpl = this;
            } catch (Throwable th) {
                th = th;
                userRepositoryImpl = this;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$notifyAboutSubscriptionFunctionUsage$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                userRepositoryImpl.f30311a.d(th, false);
                return E8.a.i(userRepositoryImpl.f30315e.a(th));
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    @Override // K8.v
    public final Object v(kotlin.coroutines.c<? super C8.a<G8.E>> cVar) {
        return a(true, (ContinuationImpl) cVar);
    }

    @Override // K8.v
    public final Object w(List list, ContinuationImpl continuationImpl) throws Throwable {
        ArrayList arrayList = this.f30317g;
        arrayList.clear();
        arrayList.addAll(list);
        Object objF = C2680e.f(N.f43198a, new UserRepositoryImpl$setPermissions$2(this, null), continuationImpl);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }

    @Override // K8.v
    public final boolean x() {
        if (z()) {
            return L().getBoolean("is2FAEnabled");
        }
        return false;
    }

    @Override // K8.v
    public final kotlinx.coroutines.channels.a<Boolean> y() {
        return this.f30319i;
    }

    @Override // K8.v
    public final boolean z() {
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        return (zVar == null || ParseAnonymousUtils.isLinked(zVar)) ? false : true;
    }
}
