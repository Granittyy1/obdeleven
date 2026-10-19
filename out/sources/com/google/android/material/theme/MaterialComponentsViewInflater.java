package com.google.android.material.theme;

import A5.a;
import H0.b;
import P5.c;
import X5.x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.C0851d;
import androidx.appcompat.widget.C0853f;
import androidx.appcompat.widget.C0871y;
import com.google.android.material.button.MaterialButton;
import com.voltasit.obdeleven.R;
import p100i.o;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends o {
    @Override // p100i.o
    public final C0851d a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // p100i.o
    public final C0853f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p100i.o
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // p100i.o
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        O5.a aVar = new O5.a(Z5.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = aVar.getContext();
        TypedArray typedArrayD = K5.o.d(context2, attributeSet, p204q5.a.f46126t, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            b.c(aVar, c.a(context2, typedArrayD, 0));
        }
        aVar.f4861g = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        return aVar;
    }

    @Override // p100i.o
    public final C0871y e(Context context, AttributeSet attributeSet) {
        Y5.a aVar = new Y5.a(Z5.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (P5.b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = p204q5.a.f46129w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iC = Y5.a.c(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iC == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, p204q5.a.f46128v);
                    int iC2 = Y5.a.c(aVar.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iC2 >= 0) {
                        aVar.setLineHeight(iC2);
                    }
                }
            }
        }
        return aVar;
    }
}
