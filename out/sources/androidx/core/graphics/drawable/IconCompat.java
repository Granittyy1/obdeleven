package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f16833k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f16836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f16837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f16840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f16841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16842i;
    public String j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f16834a) {
                case -1:
                    return (Icon) iconCompat.f16835b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f16835b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f16838e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f16835b, iconCompat.f16838e, iconCompat.f16839f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f16835b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.b((Bitmap) iconCompat.f16835b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.h());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream inputStreamI = iconCompat.i(context);
                        if (inputStreamI == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamI));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f16840g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f16841h;
            if (mode != IconCompat.f16833k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f16834a = -1;
        this.f16836c = null;
        this.f16837d = null;
        this.f16838e = 0;
        this.f16839f = 0;
        this.f16840g = null;
        this.f16841h = f16833k;
        this.f16842i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f16838e = bundle.getInt("int1");
        iconCompat.f16839f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f16840g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f16841h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f16835b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f16835b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f16835b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int iC = a.c(icon);
        if (iC == 2) {
            return e(null, a.b(icon), a.a(icon));
        }
        if (iC == 4) {
            Uri uriD = a.d(icon);
            uriD.getClass();
            String string = uriD.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f16835b = string;
            return iconCompat;
        }
        if (iC != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f16835b = icon;
            return iconCompat2;
        }
        Uri uriD2 = a.d(icon);
        uriD2.getClass();
        String string2 = uriD2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f16835b = string2;
        return iconCompat3;
    }

    public static IconCompat c(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f16835b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Context context, int i10) {
        context.getClass();
        return e(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat e(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f16838e = i10;
        if (resources != null) {
            try {
                iconCompat.f16835b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f16835b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int f() {
        int i10 = this.f16834a;
        if (i10 == -1) {
            return a.a(this.f16835b);
        }
        if (i10 == 2) {
            return this.f16838e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String g() {
        int i10 = this.f16834a;
        if (i10 == -1) {
            return a.b(this.f16835b);
        }
        if (i10 == 2) {
            String str = this.j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f16835b).split(":", -1)[0] : this.j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri h() {
        int i10 = this.f16834a;
        if (i10 == -1) {
            return a.d(this.f16835b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f16835b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final InputStream i(Context context) {
        Uri uriH = h();
        String scheme = uriH.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriH);
            } catch (Exception unused) {
                uriH.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f16835b));
        } catch (FileNotFoundException unused2) {
            uriH.toString();
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f16834a == -1) {
            return String.valueOf(this.f16835b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f16834a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f16834a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f16835b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f16835b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f16838e);
                if (this.f16839f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f16839f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f16835b);
                break;
        }
        if (this.f16840g != null) {
            sb2.append(" tint=");
            sb2.append(this.f16840g);
        }
        if (this.f16841h != f16833k) {
            sb2.append(" mode=");
            sb2.append(this.f16841h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f16836c = null;
        this.f16837d = null;
        this.f16838e = 0;
        this.f16839f = 0;
        this.f16840g = null;
        this.f16841h = f16833k;
        this.f16842i = null;
        this.f16834a = i10;
    }
}
