package Z3;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.voltasit.obdeleven.R;
import java.util.Locale;

/* JADX INFO: compiled from: ProfileCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements p128k2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7914a;

    public z() {
        SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f7914a = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    @Override // p128k2.r
    public String a(p078g1.n nVar) {
        String strB;
        String string;
        String strD;
        int iH = p078g1.t.h(nVar.f35302n);
        int i10 = nVar.f35279D;
        int i11 = nVar.f35310v;
        int i12 = nVar.f35309u;
        if (iH == -1) {
            String str = null;
            String str2 = nVar.f35299k;
            if (str2 == null) {
                strD = null;
                break;
            }
            String[] strArrP = p114j1.A.P(str2);
            int length = strArrP.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    strD = null;
                    break;
                }
                strD = p078g1.t.d(strArrP[i13]);
                if (strD != null && p078g1.t.l(strD)) {
                    break;
                }
                i13++;
            }
            if (strD == null) {
                if (str2 != null) {
                    for (String str3 : p114j1.A.P(str2)) {
                        String strD2 = p078g1.t.d(str3);
                        if (strD2 != null && p078g1.t.i(strD2)) {
                            str = strD2;
                            break;
                        }
                    }
                }
                if (str != null) {
                    iH = 1;
                } else if (i12 != -1 || i11 != -1) {
                    iH = 2;
                } else if (i10 == -1 && nVar.f35280E == -1) {
                    iH = -1;
                } else {
                    iH = 1;
                }
            } else {
                iH = 2;
            }
        }
        Resources resources = (Resources) this.f7914a;
        int i14 = nVar.j;
        if (iH == 2) {
            strB = d(c(nVar), (i12 == -1 || i11 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i12), Integer.valueOf(i11)), i14 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i14 / 1000000.0f)) : "");
        } else if (iH == 1) {
            String strB2 = b(nVar);
            if (i10 == -1 || i10 < 1) {
                string = "";
            } else if (i10 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i10 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i10 == 6 || i10 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i10 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strB = d(strB2, string, i14 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i14 / 1000000.0f)) : "");
        } else {
            strB = b(nVar);
        }
        if (strB.length() != 0) {
            return strB;
        }
        String str4 = nVar.f35293d;
        return (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    public String b(p078g1.n nVar) {
        String displayName;
        String str = nVar.f35293d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = p114j1.A.f40996a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = d(displayName, c(nVar));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        String str2 = nVar.f35291b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public String c(p078g1.n nVar) {
        int i10 = nVar.f35295f & 2;
        Resources resources = (Resources) this.f7914a;
        String string = i10 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i11 = nVar.f35295f;
        if ((i11 & 4) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i11 & 1088) != 0 ? d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f7914a).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public z(Resources resources) {
        resources.getClass();
        this.f7914a = resources;
    }
}
