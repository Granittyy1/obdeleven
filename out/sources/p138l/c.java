package p138l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: ContextThemeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f44041f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f44043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f44044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f44045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f44046e;

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f44046e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f44045d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f44045d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f44043b == null) {
            this.f44043b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f44043b.setTo(theme);
            }
        }
        this.f44043b.applyStyle(this.f44042a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f44046e == null) {
            Configuration configuration = this.f44045d;
            if (configuration == null) {
                this.f44046e = super.getResources();
            } else {
                if (f44041f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f44041f = configuration2;
                }
                if (configuration.equals(f44041f)) {
                    this.f44046e = super.getResources();
                } else {
                    this.f44046e = createConfigurationContext(this.f44045d).getResources();
                }
            }
        }
        return this.f44046e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f44044c == null) {
            this.f44044c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f44044c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f44043b;
        if (theme != null) {
            return theme;
        }
        if (this.f44042a == 0) {
            this.f44042a = 2132018051;
        }
        b();
        return this.f44043b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f44042a != i10) {
            this.f44042a = i10;
            b();
        }
    }

    public c(Context context, int i10) {
        super(context);
        this.f44042a = i10;
    }
}
