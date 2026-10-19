package com.google.android.gms.location;

import C4.b;
import U4.C0803k;
import U4.C0804l;
import V4.a;
import Y4.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import androidx.compose.material.T;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.j;
import com.google.android.gms.internal.location.k;
import java.lang.reflect.Method;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.R;
import p106i5.d;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f26520i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f26521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f26523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WorkSource f26524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f26525o;

    @Deprecated
    public LocationRequest() {
        this(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, BrazeLogger.SUPPRESS, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public static String k(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = k.f25380a;
        synchronized (sb2) {
            sb2.setLength(0);
            k.a(j, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public final boolean e() {
        long j = this.f26516e;
        return j > 0 && (j >> 1) >= this.f26514c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i10 = this.f26513b;
            if (i10 == locationRequest.f26513b && ((i10 == 105 || this.f26514c == locationRequest.f26514c) && this.f26515d == locationRequest.f26515d && e() == locationRequest.e() && ((!e() || this.f26516e == locationRequest.f26516e) && this.f26517f == locationRequest.f26517f && this.f26518g == locationRequest.f26518g && this.f26519h == locationRequest.f26519h && this.f26520i == locationRequest.f26520i && this.f26521k == locationRequest.f26521k && this.f26522l == locationRequest.f26522l && this.f26523m == locationRequest.f26523m && this.f26524n.equals(locationRequest.f26524n) && C0803k.a(this.f26525o, locationRequest.f26525o)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26513b), Long.valueOf(this.f26514c), Long.valueOf(this.f26515d), this.f26524n});
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    public final String toString() {
        Method method;
        int iIntValue;
        String str;
        String str2;
        StringBuilder sbE = b.e("Request[");
        int i10 = this.f26513b;
        boolean zBooleanValue = false;
        boolean z10 = i10 == 105;
        long j = this.f26516e;
        long j10 = this.f26514c;
        if (z10) {
            sbE.append(T.o(i10));
            if (j > 0) {
                sbE.append("/");
                k.a(j, sbE);
            }
        } else {
            sbE.append("@");
            if (e()) {
                k.a(j10, sbE);
                sbE.append("/");
                k.a(j, sbE);
            } else {
                k.a(j10, sbE);
            }
            sbE.append(" ");
            sbE.append(T.o(this.f26513b));
        }
        boolean z11 = this.f26513b == 105;
        long j11 = this.f26515d;
        if (z11 || j11 != j10) {
            sbE.append(", minUpdateInterval=");
            sbE.append(k(j11));
        }
        float f10 = this.f26519h;
        if (f10 > 0.0d) {
            sbE.append(", minUpdateDistance=");
            sbE.append(f10);
        }
        boolean z12 = this.f26513b == 105;
        long j12 = this.j;
        if (!z12 ? j12 != j10 : j12 != Long.MAX_VALUE) {
            sbE.append(", maxUpdateAge=");
            sbE.append(k(j12));
        }
        long j13 = this.f26517f;
        if (j13 != Long.MAX_VALUE) {
            sbE.append(", duration=");
            k.a(j13, sbE);
        }
        int i11 = this.f26518g;
        if (i11 != Integer.MAX_VALUE) {
            sbE.append(", maxUpdates=");
            sbE.append(i11);
        }
        int i12 = this.f26522l;
        if (i12 != 0) {
            sbE.append(", ");
            if (i12 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i12 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            sbE.append(str2);
        }
        int i13 = this.f26521k;
        if (i13 != 0) {
            sbE.append(", ");
            if (i13 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i13 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbE.append(str);
        }
        if (this.f26520i) {
            sbE.append(", waitForAccurateLocation");
        }
        if (this.f26523m) {
            sbE.append(", bypass");
        }
        Method method2 = i.f7613d;
        WorkSource workSource = this.f26524n;
        if (method2 != null) {
            try {
                Object objInvoke = method2.invoke(workSource, null);
                C0804l.h(objInvoke);
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
                method = i.f7612c;
                if (method != null) {
                    try {
                        Object objInvoke2 = method.invoke(workSource, null);
                        C0804l.h(objInvoke2);
                        iIntValue = ((Integer) objInvoke2).intValue();
                    } catch (Exception e11) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 0) {
                    zBooleanValue = true;
                }
            }
        } else {
            method = i.f7612c;
            if (method != null) {
                Object objInvoke3 = method.invoke(workSource, null);
                C0804l.h(objInvoke3);
                iIntValue = ((Integer) objInvoke3).intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                zBooleanValue = true;
            }
        }
        if (!zBooleanValue) {
            sbE.append(", ");
            sbE.append(workSource);
        }
        j jVar = this.f26525o;
        if (jVar != null) {
            sbE.append(", impersonation=");
            sbE.append(jVar);
        }
        sbE.append(']');
        return sbE.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        int i11 = this.f26513b;
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(i11);
        Fa.d.n(parcel, 2, 8);
        parcel.writeLong(this.f26514c);
        Fa.d.n(parcel, 3, 8);
        parcel.writeLong(this.f26515d);
        Fa.d.n(parcel, 6, 4);
        parcel.writeInt(this.f26518g);
        Fa.d.n(parcel, 7, 4);
        parcel.writeFloat(this.f26519h);
        Fa.d.n(parcel, 8, 8);
        parcel.writeLong(this.f26516e);
        Fa.d.n(parcel, 9, 4);
        parcel.writeInt(this.f26520i ? 1 : 0);
        Fa.d.n(parcel, 10, 8);
        parcel.writeLong(this.f26517f);
        Fa.d.n(parcel, 11, 8);
        parcel.writeLong(this.j);
        Fa.d.n(parcel, 12, 4);
        parcel.writeInt(this.f26521k);
        Fa.d.n(parcel, 13, 4);
        parcel.writeInt(this.f26522l);
        Fa.d.n(parcel, 15, 4);
        parcel.writeInt(this.f26523m ? 1 : 0);
        Fa.d.j(parcel, 16, this.f26524n, i10);
        Fa.d.j(parcel, 17, this.f26525o, i10);
        Fa.d.p(parcel, iO);
    }

    public LocationRequest(int i10, long j, long j10, long j11, long j12, long j13, int i11, float f10, boolean z10, long j14, int i12, int i13, boolean z11, WorkSource workSource, j jVar) {
        long j15;
        this.f26513b = i10;
        if (i10 == 105) {
            this.f26514c = Long.MAX_VALUE;
            j15 = j;
        } else {
            j15 = j;
            this.f26514c = j15;
        }
        this.f26515d = j10;
        this.f26516e = j11;
        this.f26517f = j12 == Long.MAX_VALUE ? j13 : Math.min(Math.max(1L, j12 - SystemClock.elapsedRealtime()), j13);
        this.f26518g = i11;
        this.f26519h = f10;
        this.f26520i = z10;
        this.j = j14 != -1 ? j14 : j15;
        this.f26521k = i12;
        this.f26522l = i13;
        this.f26523m = z11;
        this.f26524n = workSource;
        this.f26525o = jVar;
    }
}
