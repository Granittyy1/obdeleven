package p131k5;

import O.a;
import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k5.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2560s extends D1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AccountManager f42444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f42445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f42446g;

    @Override // p131k5.D1
    public final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.f42442c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f42443d = a.f(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long t() {
        q();
        return this.f42442c;
    }

    public final String u() {
        q();
        return this.f42443d;
    }
}
