package androidx.core.app;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Objects;

/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f16682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f16683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16687f;

    /* JADX INFO: compiled from: Person.java */
    public static class a {
        public static F a(PersistableBundle persistableBundle) {
            String string = persistableBundle.getString("name");
            String string2 = persistableBundle.getString("uri");
            String string3 = persistableBundle.getString("key");
            boolean z10 = persistableBundle.getBoolean("isBot");
            boolean z11 = persistableBundle.getBoolean("isImportant");
            F f10 = new F();
            f10.f16682a = string;
            f10.f16683b = null;
            f10.f16684c = string2;
            f10.f16685d = string3;
            f10.f16686e = z10;
            f10.f16687f = z11;
            return f10;
        }

        public static PersistableBundle b(F f10) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = f10.f16682a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", f10.f16684c);
            persistableBundle.putString("key", f10.f16685d);
            persistableBundle.putBoolean("isBot", f10.f16686e);
            persistableBundle.putBoolean("isImportant", f10.f16687f);
            return persistableBundle;
        }
    }

    /* JADX INFO: compiled from: Person.java */
    public static class b {
        public static F a(Person person) {
            CharSequence name = person.getName();
            IconCompat iconCompatB = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
            String uri = person.getUri();
            String key = person.getKey();
            boolean zIsBot = person.isBot();
            boolean zIsImportant = person.isImportant();
            F f10 = new F();
            f10.f16682a = name;
            f10.f16683b = iconCompatB;
            f10.f16684c = uri;
            f10.f16685d = key;
            f10.f16686e = zIsBot;
            f10.f16687f = zIsImportant;
            return f10;
        }

        public static Person b(F f10) {
            Person.Builder name = new Person.Builder().setName(f10.f16682a);
            Icon iconF = null;
            IconCompat iconCompat = f10.f16683b;
            if (iconCompat != null) {
                iconCompat.getClass();
                iconF = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(iconF).setUri(f10.f16684c).setKey(f10.f16685d).setBot(f10.f16686e).setImportant(f10.f16687f).build();
        }
    }

    public static F a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(InAppMessageBase.ICON);
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z10 = bundle.getBoolean("isBot");
        boolean z11 = bundle.getBoolean("isImportant");
        F f10 = new F();
        f10.f16682a = charSequence;
        f10.f16683b = iconCompatA;
        f10.f16684c = string;
        f10.f16685d = string2;
        f10.f16686e = z10;
        f10.f16687f = z11;
        return f10;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f16682a);
        IconCompat iconCompat = this.f16683b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f16834a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f16835b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f16835b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f16835b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f16835b);
                    break;
            }
            bundle.putInt("type", iconCompat.f16834a);
            bundle.putInt("int1", iconCompat.f16838e);
            bundle.putInt("int2", iconCompat.f16839f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.f16840g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f16841h;
            if (mode != IconCompat.f16833k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle(InAppMessageBase.ICON, bundle);
        bundle2.putString("uri", this.f16684c);
        bundle2.putString("key", this.f16685d);
        bundle2.putBoolean("isBot", this.f16686e);
        bundle2.putBoolean("isImportant", this.f16687f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        String str = this.f16685d;
        String str2 = f10.f16685d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f16682a), Objects.toString(f10.f16682a)) && Objects.equals(this.f16684c, f10.f16684c) && Boolean.valueOf(this.f16686e).equals(Boolean.valueOf(f10.f16686e)) && Boolean.valueOf(this.f16687f).equals(Boolean.valueOf(f10.f16687f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f16685d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f16682a, this.f16684c, Boolean.valueOf(this.f16686e), Boolean.valueOf(this.f16687f));
    }
}
