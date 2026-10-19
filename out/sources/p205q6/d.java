package p205q6;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import p131k5.Q;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImmutableSet<String> f46136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableList<String> f46137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableList<String> f46138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableList<String> f46139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableList<String> f46140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableList<String> f46141f;

    static {
        int i10 = ImmutableSet.f27887d;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f46136a = ImmutableSet.B(15, objArr);
        ImmutableList.b bVar = ImmutableList.f27874c;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        p019b6.d.b(7, objArr2);
        f46137b = ImmutableList.A(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        p019b6.d.b(3, objArr3);
        f46138c = ImmutableList.A(3, objArr3);
        f46139d = ImmutableList.N("_r", "_dbg");
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.d(Q.f41962e);
        aVar.d(Q.f41963f);
        f46140e = aVar.h();
        f46141f = ImmutableList.N("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (f46137b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList<String> immutableList = f46139d;
        int size = immutableList.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = immutableList.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f46140e.contains(str2)) {
            return false;
        }
        ImmutableList<String> immutableList = f46141f;
        int size = immutableList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = immutableList.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Bundle bundle, String str, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        ImmutableList<String> immutableList = f46139d;
        int size = immutableList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = immutableList.get(i10);
            i10++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.getClass();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean d(String str) {
        return !f46138c.contains(str);
    }
}
