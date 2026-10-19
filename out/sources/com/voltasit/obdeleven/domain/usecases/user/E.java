package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.PasswordEmptyException;
import com.voltasit.obdeleven.domain.exceptions.PasswordLongException;
import com.voltasit.obdeleven.domain.exceptions.PasswordMustContainLowercaseException;
import com.voltasit.obdeleven.domain.exceptions.PasswordMustContainNumberException;
import com.voltasit.obdeleven.domain.exceptions.PasswordMustContainSpecialCharacterException;
import com.voltasit.obdeleven.domain.exceptions.PasswordMustContainUppercaseException;
import com.voltasit.obdeleven.domain.exceptions.PasswordShortException;
import kotlin.text.Regex;

/* JADX INFO: compiled from: ValidatePasswordUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class E {
    public static C8.a a(String password) {
        kotlin.jvm.internal.i.e(password, "password");
        if (password.length() == 0) {
            return new C8.a.C0024a(PasswordEmptyException.f30415b);
        }
        if (password.length() < 10) {
            return new C8.a.C0024a(PasswordShortException.f30421b);
        }
        if (password.length() > 32) {
            return new C8.a.C0024a(PasswordLongException.f30416b);
        }
        if (!new Regex("[a-z]").a(password)) {
            return new C8.a.C0024a(PasswordMustContainLowercaseException.f30417b);
        }
        if (!new Regex("[A-Z]").a(password)) {
            return new C8.a.C0024a(PasswordMustContainUppercaseException.f30420b);
        }
        if (new Regex("[0-9]").a(password)) {
            return !new Regex("[ !\"#$%&'()*+,-./:;<=>?@\\[\\\\^_`{|}~\\]]").a(password) ? new C8.a.C0024a(PasswordMustContainSpecialCharacterException.f30419b) : new C8.a.b(p293xa.r.f47939a);
        }
        return new C8.a.C0024a(PasswordMustContainNumberException.f30418b);
    }
}
