package com.voltas.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HighlightView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f29589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f29590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f29591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f29592e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f29596i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f29597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29598l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HandleMode f29600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f29602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f29603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f29604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29605s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f29593f = new Paint();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f29594g = new Paint();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f29595h = new Paint();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ModifyMode f29599m = ModifyMode.f29609b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HandleMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HandleMode f29606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final HandleMode f29607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ HandleMode[] f29608d;

        static {
            HandleMode handleMode = new HandleMode("Changing", 0);
            f29606b = handleMode;
            HandleMode handleMode2 = new HandleMode("Always", 1);
            f29607c = handleMode2;
            f29608d = new HandleMode[]{handleMode, handleMode2, new HandleMode("Never", 2)};
        }

        public HandleMode() {
            throw null;
        }

        public static HandleMode valueOf(String str) {
            return (HandleMode) Enum.valueOf(HandleMode.class, str);
        }

        public static HandleMode[] values() {
            return (HandleMode[]) f29608d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ModifyMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ModifyMode f29609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ModifyMode f29610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ModifyMode f29611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ModifyMode[] f29612e;

        static {
            ModifyMode modifyMode = new ModifyMode("None", 0);
            f29609b = modifyMode;
            ModifyMode modifyMode2 = new ModifyMode("Move", 1);
            f29610c = modifyMode2;
            ModifyMode modifyMode3 = new ModifyMode("Grow", 2);
            f29611d = modifyMode3;
            f29612e = new ModifyMode[]{modifyMode, modifyMode2, modifyMode3};
        }

        public ModifyMode() {
            throw null;
        }

        public static ModifyMode valueOf(String str) {
            return (ModifyMode) Enum.valueOf(ModifyMode.class, str);
        }

        public static ModifyMode[] values() {
            return (ModifyMode[]) f29612e.clone();
        }
    }

    public HighlightView(View view, boolean z10) {
        this.f29600n = HandleMode.f29606b;
        this.f29596i = view;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.cropImageStyle, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, p278w8.e.f47803a);
        try {
            this.j = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.f29597k = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.f29598l = typedArrayObtainStyledAttributes.getColor(0, -13388315);
            this.f29600n = HandleMode.values()[typedArrayObtainStyledAttributes.getInt(2, 0)];
            typedArrayObtainStyledAttributes.recycle();
            this.f29588a = z10;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static Rect b(Rect rect, boolean z10) {
        if (!z10) {
            return rect;
        }
        int iHeight = rect.height();
        int iWidth = rect.width();
        if (iHeight > iWidth) {
            int i10 = (iHeight - iWidth) / 2;
            return new Rect(rect.left - i10, rect.top, rect.right + i10, rect.bottom);
        }
        if (iWidth <= iHeight) {
            return rect;
        }
        int i11 = (iWidth - iHeight) / 2;
        return new Rect(rect.left, rect.top - i11, rect.right, rect.bottom + i11);
    }

    public final Rect a() {
        RectF rectF = this.f29589b;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f29591d.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }
}
