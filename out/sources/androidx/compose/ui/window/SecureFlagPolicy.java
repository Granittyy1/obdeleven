package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SecureFlagPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureFlagPolicy f15821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SecureFlagPolicy f15822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SecureFlagPolicy[] f15823d;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        f15821b = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        f15822c = secureFlagPolicy2;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
        f15823d = secureFlagPolicyArr;
        kotlin.enums.a.a(secureFlagPolicyArr);
    }

    public SecureFlagPolicy() {
        throw null;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f15823d.clone();
    }
}
