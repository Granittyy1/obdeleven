package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2029c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2028b f27048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2028b f27049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2028b f27050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2028b f27051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2028b f27052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2028b f27053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2028b f27054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f27055h;

    public C2029c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(P5.b.c(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, p204q5.a.f46123q);
        this.f27048a = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f27054g = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f27049b = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f27050c = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = P5.c.a(context, typedArrayObtainStyledAttributes, 7);
        this.f27051d = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f27052e = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f27053f = C2028b.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f27055h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
