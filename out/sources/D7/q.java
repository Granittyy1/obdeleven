package D7;

/* JADX INFO: compiled from: FirebaseRemoteConfigValueImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements C7.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2873b;

    public q(String str, int i10) {
        this.f2872a = str;
        this.f2873b = i10;
    }

    @Override // C7.k
    public final long a() {
        if (this.f2873b == 0) {
            return 0L;
        }
        String strTrim = c().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("[Value: ", strTrim, "] cannot be converted to a long."), e10);
        }
    }

    @Override // C7.k
    public final double b() {
        if (this.f2873b == 0) {
            return 0.0d;
        }
        String strTrim = c().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("[Value: ", strTrim, "] cannot be converted to a double."), e10);
        }
    }

    @Override // C7.k
    public final String c() {
        return this.f2873b == 0 ? "" : this.f2872a;
    }

    @Override // C7.k
    public final boolean d() throws IllegalArgumentException {
        if (this.f2873b == 0) {
            return false;
        }
        String strTrim = c().trim();
        if (k.f2854e.matcher(strTrim).matches()) {
            return true;
        }
        if (k.f2855f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    @Override // C7.k
    public final int getSource() {
        return this.f2873b;
    }
}
