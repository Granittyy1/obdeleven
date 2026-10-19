package com.voltasit.obdeleven.domain.models;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.Screen[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.Screen[]) from 0x0104: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.Screen[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:261)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: Screen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Screen {
    MainFragment("mainFragment"),
    ProfileFragment("profileFragment"),
    EmailVerificationInput("email_verification_input"),
    f30525f("email_verification_confirmation/{email}", M1.k("email")),
    PersonalInfoExplanation("personal_info_explanation"),
    SfdWizardHome("sfd_intro"),
    SfdPersonalInfoForm("personal_info_form"),
    TwoFactorAuthIntro("two_factor_intro"),
    TwoFactorAuthSetup("two_factor_auth_setup"),
    TwoFactorAuthVerify("two_factor_auth_verify"),
    TwoFactorAuthActivated("two_factor_auth_activated"),
    TwoFactorAuthBackup("two_factor_backup/{backup_code}"),
    UpdatePersonalInfo("update_personal_info"),
    EditPhoneNumber("edit_phone_number"),
    PhoneNumberConfirmation("confirm_phone_number/{mobile}"),
    PhoneNumberConfirmationSuccess("phone_number_confirmation_success/{mobile}"),
    Loading("loading"),
    None("");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30521b;
    private final List<String> arguments;
    private final String route;

    /* JADX INFO: compiled from: Screen.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public static Screen a(String str) {
            for (Screen screen : Screen.values()) {
                if (i.a(screen.a(), str)) {
                    if (screen == null) {
                        return Screen.None;
                    }
                    return screen;
                }
            }
            screen = null;
            if (screen == null) {
                return Screen.None;
            }
            return screen;
        }
    }

    static {
        kotlin.enums.a.a(screenArr);
        f30521b = new a();
    }

    public Screen(String str, List list) {
        super(str, i);
        this.route = str;
        this.arguments = list;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) f30539u.clone();
    }

    public final String a() {
        return this.route;
    }

    public Screen(String str) {
        this(str, EmptyList.f42983b);
    }
}
