package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.AccountLockedDueToMultipleAttemptsException;
import com.voltasit.obdeleven.domain.exceptions.EmailEmptyException;
import com.voltasit.obdeleven.domain.exceptions.EmailNotVerifiedException;
import com.voltasit.obdeleven.domain.exceptions.EmailPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.HttpException;
import com.voltasit.obdeleven.domain.exceptions.InvalidEmailException;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import com.voltasit.obdeleven.domain.exceptions.PasswordEmptyException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordMissingException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LogInWithEmailUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f31015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.a f31016b;

    public s(K8.v vVar, J8.a aVar) {
        this.f31015a = vVar;
        this.f31016b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        LogInWithEmailUC$invoke$1 logInWithEmailUC$invoke$1;
        Object c0024a;
        String str5;
        String str6;
        String str7;
        s sVar;
        Object c0024a2;
        Object c0024a3;
        boolean z10;
        J8.a aVar;
        Throwable th;
        if (continuationImpl instanceof LogInWithEmailUC$invoke$1) {
            logInWithEmailUC$invoke$1 = (LogInWithEmailUC$invoke$1) continuationImpl;
            int i10 = logInWithEmailUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                logInWithEmailUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                logInWithEmailUC$invoke$1 = new LogInWithEmailUC$invoke$1(this, continuationImpl);
            }
        } else {
            logInWithEmailUC$invoke$1 = new LogInWithEmailUC$invoke$1(this, continuationImpl);
        }
        Object objP = logInWithEmailUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = logInWithEmailUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                String str8 = (String) logInWithEmailUC$invoke$1.L$3;
                String str9 = (String) logInWithEmailUC$invoke$1.L$2;
                String str10 = (String) logInWithEmailUC$invoke$1.L$1;
                s sVar2 = (s) logInWithEmailUC$invoke$1.L$0;
                kotlin.b.b(objP);
                str5 = str10;
                str6 = str9;
                str7 = str8;
                sVar = sVar2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) logInWithEmailUC$invoke$1.L$0;
                kotlin.b.b(objP);
            }
            c0024a3 = (C8.a) objP;
            sVar.getClass();
            z10 = c0024a3 instanceof C8.a.b;
            aVar = sVar.f31016b;
            if (z10) {
                aVar.z("success");
            } else if (c0024a3 instanceof C8.a.C0024a) {
                th = ((C8.a.C0024a) c0024a3).f2462a;
                if (kotlin.jvm.internal.i.a(th, EmailPasswordIncorrectException.f30403b)) {
                    aVar.z("invalid_email_pass");
                } else if (th instanceof AccountLockedDueToMultipleAttemptsException) {
                    aVar.z("account_locked");
                } else {
                    aVar.z("failure");
                }
            }
            return c0024a3;
        }
        kotlin.b.b(objP);
        int length = str.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            boolean z12 = kotlin.jvm.internal.i.g(str.charAt(!z11 ? i12 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i12++;
            } else {
                z11 = true;
            }
        }
        String string = str.subSequence(i12, length + 1).toString();
        if (string.length() == 0) {
            c0024a = new C8.a.C0024a(EmailEmptyException.f30401b);
        } else if (A0.c.f380a.matcher(string).matches()) {
            c0024a = str2.length() == 0 ? new C8.a.C0024a(PasswordEmptyException.f30415b) : new C8.a.b(p293xa.r.f47939a);
        } else {
            c0024a = new C8.a.C0024a(InvalidEmailException.f30409b);
        }
        if (c0024a instanceof C8.a.C0024a) {
            return c0024a;
        }
        logInWithEmailUC$invoke$1.L$0 = this;
        logInWithEmailUC$invoke$1.L$1 = str2;
        logInWithEmailUC$invoke$1.L$2 = str3;
        logInWithEmailUC$invoke$1.L$3 = string;
        logInWithEmailUC$invoke$1.label = 1;
        objP = this.f31015a.P(string, str2, str3, str4, logInWithEmailUC$invoke$1);
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        str5 = str2;
        str6 = str3;
        str7 = string;
        sVar = this;
        C8.a aVar2 = (C8.a) objP;
        if (aVar2 instanceof C8.a.b) {
            c0024a3 = !((p255u9.z) ((C8.a.b) aVar2).f2463a).getBoolean("emailVerified") ? new C8.a.C0024a(EmailNotVerifiedException.f30402b) : new C8.a.b(p293xa.r.f47939a);
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th2 = ((C8.a.C0024a) aVar2).f2462a;
            logInWithEmailUC$invoke$1.L$0 = sVar;
            logInWithEmailUC$invoke$1.L$1 = null;
            logInWithEmailUC$invoke$1.L$2 = null;
            logInWithEmailUC$invoke$1.L$3 = null;
            logInWithEmailUC$invoke$1.label = 2;
            sVar.getClass();
            if (th2 instanceof AccountLockedDueToMultipleAttemptsException) {
                c0024a2 = new C8.a.C0024a(th2);
            } else {
                NoNetworkException noNetworkException = NoNetworkException.f30412b;
                if (kotlin.jvm.internal.i.a(th2, noNetworkException)) {
                    c0024a2 = new C8.a.C0024a(noNetworkException);
                } else if (kotlin.jvm.internal.i.a(th2, HttpException.Unauthorized.f30408b)) {
                    c0024a2 = new C8.a.C0024a(TemporaryPasswordIncorrectException.f30434b);
                } else if (kotlin.jvm.internal.i.a(th2, HttpException.BadRequest.f30405b)) {
                    c0024a2 = new C8.a.C0024a(TemporaryPasswordMissingException.f30435b);
                } else if ((th2 instanceof TooManySessionsException) || !(th2 instanceof HttpException.NotFound)) {
                    c0024a2 = new C8.a.C0024a(th2);
                } else if (str7.equals(str7.toLowerCase())) {
                    c0024a2 = new C8.a.C0024a(EmailPasswordIncorrectException.f30403b);
                } else {
                    String lowerCase = str7.toLowerCase();
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    c0024a2 = sVar.a(lowerCase, str5, str6, null, logInWithEmailUC$invoke$1);
                }
            }
            objP = c0024a2;
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0024a3 = (C8.a) objP;
        }
        sVar.getClass();
        z10 = c0024a3 instanceof C8.a.b;
        aVar = sVar.f31016b;
        if (z10) {
            aVar.z("success");
        } else if (c0024a3 instanceof C8.a.C0024a) {
            th = ((C8.a.C0024a) c0024a3).f2462a;
            if (kotlin.jvm.internal.i.a(th, EmailPasswordIncorrectException.f30403b)) {
                aVar.z("invalid_email_pass");
            } else if (th instanceof AccountLockedDueToMultipleAttemptsException) {
                aVar.z("account_locked");
            } else {
                aVar.z("failure");
            }
        }
        return c0024a3;
    }
}
