package F3;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3225c;

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityManager f3227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f3228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f3229d;

        public a(Context context) {
            this.f3229d = 1;
            this.f3226a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f3227b = activityManager;
            this.f3228c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f3229d = 0.0f;
            }
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f3230a;

        public b(DisplayMetrics displayMetrics) {
            this.f3230a = displayMetrics;
        }
    }

    public g(a aVar) {
        Context context = aVar.f3226a;
        ActivityManager activityManager = aVar.f3227b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f3225c = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f3228c.f3230a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = aVar.f3229d;
        int iRound2 = Math.round(f10 * f11);
        int iRound3 = Math.round(f10 * 2.0f);
        int i11 = iRound - i10;
        if (iRound3 + iRound2 <= i11) {
            this.f3224b = iRound3;
            this.f3223a = iRound2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f3224b = Math.round(2.0f * f12);
            this.f3223a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f3224b);
            Formatter.formatFileSize(context, this.f3223a);
            Formatter.formatFileSize(context, i10);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
