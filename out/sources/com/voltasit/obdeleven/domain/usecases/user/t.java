package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.date.FacebookTokenExpirationDateParseFormat;
import com.voltasit.obdeleven.domain.exceptions.EmailAlreadyExistsException;
import com.voltasit.obdeleven.domain.exceptions.HttpException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordMissingException;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LogInWithFacebookUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f31017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f31018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.a f31019c;

    public t(J8.a aVar, J8.p pVar, K8.v vVar) {
        this.f31017a = vVar;
        this.f31018b = pVar;
        this.f31019c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, Date date, String str3, String str4, ContinuationImpl continuationImpl) {
        LogInWithFacebookUC$invoke$1 logInWithFacebookUC$invoke$1;
        Date date2;
        t tVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        t tVar2;
        C8.a aVar;
        Throwable th;
        if (continuationImpl instanceof LogInWithFacebookUC$invoke$1) {
            logInWithFacebookUC$invoke$1 = (LogInWithFacebookUC$invoke$1) continuationImpl;
            int i10 = logInWithFacebookUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                logInWithFacebookUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                logInWithFacebookUC$invoke$1 = new LogInWithFacebookUC$invoke$1(this, continuationImpl);
            }
        } else {
            logInWithFacebookUC$invoke$1 = new LogInWithFacebookUC$invoke$1(this, continuationImpl);
        }
        LogInWithFacebookUC$invoke$1 logInWithFacebookUC$invoke$2 = logInWithFacebookUC$invoke$1;
        Object obj = logInWithFacebookUC$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = logInWithFacebookUC$invoke$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                String str10 = (String) logInWithFacebookUC$invoke$2.L$5;
                String str11 = (String) logInWithFacebookUC$invoke$2.L$4;
                date2 = (Date) logInWithFacebookUC$invoke$2.L$3;
                String str12 = (String) logInWithFacebookUC$invoke$2.L$2;
                str7 = (String) logInWithFacebookUC$invoke$2.L$1;
                t tVar3 = (t) logInWithFacebookUC$invoke$2.L$0;
                kotlin.b.b(obj);
                str6 = str10;
                tVar = tVar3;
                str5 = str11;
                str8 = str12;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str9 = (String) logInWithFacebookUC$invoke$2.L$1;
                tVar2 = (t) logInWithFacebookUC$invoke$2.L$0;
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                tVar2.f31019c.z("Success");
                return new C8.a.b(p293xa.r.f47939a);
            }
            if (aVar instanceof C8.a.C0024a) {
                throw new NoWhenBranchMatchedException();
            }
            tVar2.f31019c.z("failure");
            th = ((C8.a.C0024a) aVar).f2462a;
            if (kotlin.jvm.internal.i.a(th, HttpException.Unauthorized.f30408b)) {
                return new C8.a.C0024a(TemporaryPasswordIncorrectException.f30434b);
            }
            if (kotlin.jvm.internal.i.a(th, HttpException.BadRequest.f30405b)) {
                return new C8.a.C0024a(TemporaryPasswordMissingException.f30435b);
            }
            return th instanceof EmailAlreadyExistsException ? new C8.a.C0024a(new EmailAlreadyExistsException(str9)) : new C8.a.C0024a(th);
        }
        kotlin.b.b(obj);
        logInWithFacebookUC$invoke$2.L$0 = this;
        logInWithFacebookUC$invoke$2.L$1 = str;
        logInWithFacebookUC$invoke$2.L$2 = str2;
        date2 = date;
        logInWithFacebookUC$invoke$2.L$3 = date2;
        logInWithFacebookUC$invoke$2.L$4 = str3;
        logInWithFacebookUC$invoke$2.L$5 = str4;
        logInWithFacebookUC$invoke$2.label = 1;
        Object objG = this.f31017a.G(logInWithFacebookUC$invoke$2);
        if (objG == coroutineSingletons) {
            return coroutineSingletons;
        }
        tVar = this;
        str5 = str3;
        str6 = str4;
        str7 = str;
        obj = objG;
        str8 = str2;
        C8.a aVar2 = (C8.a) obj;
        if (!(aVar2 instanceof C8.a.b)) {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            tVar.f31018b.e("LogInWithFacebookUC", "Unable to get email and password");
            tVar.f31019c.z("failure");
            return new C8.a.C0024a(((C8.a.C0024a) aVar2).f2462a);
        }
        tVar.f31018b.e("LogInWithFacebookUC", "Received email and password from Facebook");
        G8.F f10 = (G8.F) ((C8.a.b) aVar2).f2463a;
        String str13 = f10.f3415a;
        String str14 = FacebookTokenExpirationDateParseFormat.f30400b.format(date2);
        kotlin.jvm.internal.i.d(str14, "format(...)");
        logInWithFacebookUC$invoke$2.L$0 = tVar;
        String str15 = f10.f3416b;
        logInWithFacebookUC$invoke$2.L$1 = str15;
        logInWithFacebookUC$invoke$2.L$2 = null;
        logInWithFacebookUC$invoke$2.L$3 = null;
        logInWithFacebookUC$invoke$2.L$4 = null;
        logInWithFacebookUC$invoke$2.L$5 = null;
        logInWithFacebookUC$invoke$2.label = 2;
        Object objP = tVar.f31017a.p(str7, str8, str14, str13, str15, str5, str6, logInWithFacebookUC$invoke$2);
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        str9 = str15;
        obj = objP;
        tVar2 = tVar;
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            tVar2.f31019c.z("Success");
            return new C8.a.b(p293xa.r.f47939a);
        }
        if (aVar instanceof C8.a.C0024a) {
            throw new NoWhenBranchMatchedException();
        }
        tVar2.f31019c.z("failure");
        th = ((C8.a.C0024a) aVar).f2462a;
        if (kotlin.jvm.internal.i.a(th, HttpException.Unauthorized.f30408b)) {
            return new C8.a.C0024a(TemporaryPasswordIncorrectException.f30434b);
        }
        if (kotlin.jvm.internal.i.a(th, HttpException.BadRequest.f30405b)) {
            return new C8.a.C0024a(TemporaryPasswordMissingException.f30435b);
        }
        if (th instanceof EmailAlreadyExistsException) {
        }
    }
}
