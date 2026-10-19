package p131k5;

import U4.C0804l;
import com.google.android.gms.internal.measurement.zzfh$zzd;
import com.google.android.gms.internal.measurement.zzfh$zzf;
import com.google.android.gms.measurement.internal.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: k5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2491c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f42101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f42102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f42103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f42104f;

    public AbstractC2491c(String str, int i10) {
        this.f42099a = str;
        this.f42100b = i10;
    }

    public static Boolean b(long j, zzfh$zzd zzfh_zzd) {
        try {
            return e(new BigDecimal(j), zzfh_zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public static Boolean d(String str, zzfh$zzf zzfh_zzf, B0 b10) {
        List<String> listZ;
        C0804l.h(zzfh_zzf);
        if (str == null || !zzfh_zzf.D() || zzfh_zzf.w() == zzfh$zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfh$zzf.zza zzaVarW = zzfh_zzf.w();
        zzfh$zzf.zza zzaVar = zzfh$zzf.zza.IN_LIST;
        if (zzaVarW == zzaVar) {
            if (zzfh_zzf.v() == 0) {
                return null;
            }
        } else if (!zzfh_zzf.C()) {
            return null;
        }
        zzfh$zzf.zza zzaVarW2 = zzfh_zzf.w();
        boolean zA = zzfh_zzf.A();
        zzfh$zzf.zza zzaVar2 = zzfh$zzf.zza.REGEXP;
        String strY = (zA || zzaVarW2 == zzaVar2 || zzaVarW2 == zzaVar) ? zzfh_zzf.y() : zzfh_zzf.y().toUpperCase(Locale.ENGLISH);
        if (zzfh_zzf.v() == 0) {
            listZ = null;
        } else {
            listZ = zzfh_zzf.z();
            if (!zA) {
                ArrayList arrayList = new ArrayList(listZ.size());
                Iterator<String> it = listZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listZ = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = zzaVarW2 == zzaVar2 ? strY : null;
        if (zzaVarW2 == zzaVar) {
            if (listZ == null || listZ.isEmpty()) {
                return null;
            }
        } else if (strY == null) {
            return null;
        }
        if (!zA && zzaVarW2 != zzaVar2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (F3.f41783a[zzaVarW2.ordinal()]) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, zA ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    b10.f41715i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(strY));
            case 3:
                return Boolean.valueOf(str.endsWith(strY));
            case 4:
                return Boolean.valueOf(str.contains(strY));
            case 5:
                return Boolean.valueOf(str.equals(strY));
            case 6:
                if (listZ == null) {
                    return null;
                }
                return Boolean.valueOf(listZ.contains(str));
            default:
                return null;
        }
    }

    public static Boolean e(BigDecimal bigDecimal, zzfh$zzd zzfh_zzd, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C0804l.h(zzfh_zzd);
        if (zzfh_zzd.B() && zzfh_zzd.v() != zzfh$zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            zzfh$zzd.zzb zzbVarV = zzfh_zzd.v();
            zzfh$zzd.zzb zzbVar = zzfh$zzd.zzb.BETWEEN;
            if (zzbVarV == zzbVar) {
                if (!zzfh_zzd.F() || !zzfh_zzd.E()) {
                    return null;
                }
            } else if (!zzfh_zzd.C()) {
                return null;
            }
            zzfh$zzd.zzb zzbVarV2 = zzfh_zzd.v();
            if (zzfh_zzd.v() == zzbVar) {
                if (i.c0(zzfh_zzd.z()) && i.c0(zzfh_zzd.y())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzfh_zzd.z());
                        bigDecimal4 = new BigDecimal(zzfh_zzd.y());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!i.c0(zzfh_zzd.x())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzfh_zzd.x());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zzbVarV2 == zzbVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i10 = F3.f41784b[zzbVarV2.ordinal()];
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (bigDecimal2 != null) {
                        if (d10 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean f();

    public abstract boolean g();
}
