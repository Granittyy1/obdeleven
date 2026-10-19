package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.voltasit.obdeleven.R;
import java.text.NumberFormat;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    CharSequence mBigContentTitle;
    protected v mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    private int calculateTopPadding() {
        Resources resources = this.mBuilder.f16796a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float fConstrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
        return Math.round((fConstrain * dimensionPixelSize2) + ((1.0f - fConstrain) * dimensionPixelSize));
    }

    private static float constrain(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static B constructCompatStyleByName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new y();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new s();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new x();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new z();
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new t();
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new A();
            default:
                return null;
        }
    }

    private static B constructCompatStyleByPlatformName(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(Notification.BigPictureStyle.class.getName())) {
            return new s();
        }
        if (str.equals(Notification.BigTextStyle.class.getName())) {
            return new t();
        }
        if (str.equals(Notification.InboxStyle.class.getName())) {
            return new z();
        }
        if (str.equals(Notification.MessagingStyle.class.getName())) {
            return new A();
        }
        if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
            return new y();
        }
        return null;
    }

    public static B constructCompatStyleForBundle(Bundle bundle) {
        B bConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (bConstructCompatStyleByName != null) {
            return bConstructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new A();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new s();
        }
        if (bundle.containsKey("android.bigText")) {
            return new t();
        }
        if (bundle.containsKey("android.textLines")) {
            return new z();
        }
        return bundle.containsKey("android.callType") ? new x() : constructCompatStyleByPlatformName(bundle.getString("android.template"));
    }

    public static B constructStyleForExtras(Bundle bundle) {
        B bConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (bConstructCompatStyleForBundle == null) {
            return null;
        }
        try {
            bConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return bConstructCompatStyleForBundle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    private Bitmap createIconWithBackground(int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            i13 = 0;
        }
        Bitmap bitmapCreateColoredBitmap = createColoredBitmap(R.drawable.notification_icon_background, i13, i11);
        Canvas canvas = new Canvas(bitmapCreateColoredBitmap);
        Drawable drawableMutate = this.mBuilder.f16796a.getResources().getDrawable(i10).mutate();
        drawableMutate.setFilterBitmap(true);
        int i14 = (i11 - i12) / 2;
        int i15 = i12 + i14;
        drawableMutate.setBounds(i14, i14, i15, i15);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapCreateColoredBitmap;
    }

    public static B extractStyleFromNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    private void hideNormalContent(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public RemoteViews applyStandardTemplate(boolean z10, int i10, boolean z11) {
        boolean z12;
        boolean z13;
        Resources resources = this.mBuilder.f16796a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.mBuilder.f16796a.getPackageName(), i10);
        v vVar = this.mBuilder;
        int i11 = vVar.j;
        if (vVar.f16803h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.f16803h, 0));
            if (z10 && this.mBuilder.f16793C.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                v vVar2 = this.mBuilder;
                remoteViews.setImageViewBitmap(R.id.right_icon, createIconWithBackground(vVar2.f16793C.icon, dimensionPixelSize, dimensionPixelSize2, vVar2.f16813s));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z10 && vVar.f16793C.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            v vVar3 = this.mBuilder;
            remoteViews.setImageViewBitmap(R.id.icon, createIconWithBackground(vVar3.f16793C.icon, dimensionPixelSize3, dimensionPixelSize4, vVar3.f16813s));
        }
        CharSequence charSequence = this.mBuilder.f16800e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.mBuilder.f16801f;
        boolean z14 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z12 = true;
        } else {
            z12 = false;
        }
        this.mBuilder.getClass();
        if (this.mBuilder.f16804i > 0) {
            if (this.mBuilder.f16804i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.mBuilder.f16804i));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            z12 = true;
            z13 = true;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
            z13 = false;
        }
        CharSequence charSequence3 = this.mBuilder.f16807m;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.mBuilder.f16801f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence4);
                remoteViews.setViewVisibility(R.id.text2, 0);
                if (z11) {
                    remoteViews.setTextViewTextSize(R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(R.id.text2, 8);
            }
        }
        v vVar4 = this.mBuilder;
        if ((vVar4.f16805k ? vVar4.f16793C.when : 0L) != 0) {
            vVar4.getClass();
            remoteViews.setViewVisibility(R.id.time, 0);
            v vVar5 = this.mBuilder;
            remoteViews.setLong(R.id.time, "setTime", vVar5.f16805k ? vVar5.f16793C.when : 0L);
        } else {
            z14 = z13;
        }
        remoteViews.setViewVisibility(R.id.right_side, z14 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.line3, z12 ? 0 : 8);
        return remoteViews;
    }

    public Notification build() {
        v vVar = this.mBuilder;
        if (vVar != null) {
            return vVar.a();
        }
        return null;
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        hideNormalContent(remoteViews);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
    }

    public void clearCompatExtraKeys(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public Bitmap createColoredBitmap(int i10, int i11) {
        return createColoredBitmap(i10, i11, 0);
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(o oVar) {
        return null;
    }

    public RemoteViews makeContentView(o oVar) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(o oVar) {
        return null;
    }

    public void restoreFromCompatExtras(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.mSummaryText = bundle.getCharSequence("android.summaryText");
            this.mSummaryTextSet = true;
        }
        this.mBigContentTitle = bundle.getCharSequence("android.title.big");
    }

    public void setBuilder(v vVar) {
        if (this.mBuilder != vVar) {
            this.mBuilder = vVar;
            if (vVar != null) {
                vVar.g(this);
            }
        }
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i10) {
        return createColoredBitmap(iconCompat, i10, 0);
    }

    private Bitmap createColoredBitmap(int i10, int i11, int i12) {
        return createColoredBitmap(IconCompat.d(this.mBuilder.f16796a, i10), i11, i12);
    }

    private Bitmap createColoredBitmap(IconCompat iconCompat, int i10, int i11) {
        Object obj;
        Resources resourcesForApplication;
        Context context = this.mBuilder.f16796a;
        if (iconCompat.f16834a == 2 && (obj = iconCompat.f16835b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strG = iconCompat.g();
                    if ("android".equals(strG)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strG, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.e("IconCompat", "Unable to find pkg=" + strG + " for icon", e10);
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.f16838e != identifier) {
                        iconCompat.f16838e = identifier;
                    }
                }
            }
        }
        Drawable drawableE = IconCompat.a.e(IconCompat.a.f(iconCompat, context), context);
        int intrinsicWidth = i11 == 0 ? drawableE.getIntrinsicWidth() : i11;
        if (i11 == 0) {
            i11 = drawableE.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
        drawableE.setBounds(0, 0, intrinsicWidth, i11);
        if (i10 != 0) {
            drawableE.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        drawableE.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void apply(o oVar) {
    }
}
