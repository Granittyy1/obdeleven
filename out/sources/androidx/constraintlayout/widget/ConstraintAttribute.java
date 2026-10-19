package androidx.constraintlayout.widget;

import C7.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16364a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AttributeType f16366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16371h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AttributeType f16372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AttributeType f16373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AttributeType f16374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AttributeType f16375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AttributeType f16376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AttributeType f16377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AttributeType f16378h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AttributeType f16379i;
        public static final /* synthetic */ AttributeType[] j;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            f16372b = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            f16373c = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            f16374d = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            f16375e = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            f16376f = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            f16377g = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            f16378h = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            f16379i = attributeType8;
            j = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public AttributeType() {
            throw null;
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) j.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f16365b = constraintAttribute.f16365b;
        this.f16366c = constraintAttribute.f16366c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44127e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.f16377g;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.f16374d;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.f16375e;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    AttributeType attributeType3 = AttributeType.f16378h;
                    if (index == 7) {
                        objValueOf2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.f16373c;
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.f16372b;
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.f16376f;
                        objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.f16379i;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        objValueOf = Integer.valueOf(resourceId);
                    }
                    attributeType2 = attributeType3;
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.f16365b = string;
            constraintAttribute.f16366c = attributeType2;
            constraintAttribute.f16364a = z10;
            constraintAttribute.f(objValueOf2);
            map.put(string, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String strC = !constraintAttribute.f16364a ? B7.b.c("set", str) : str;
            try {
                switch (constraintAttribute.f16366c.ordinal()) {
                    case 0:
                        cls.getMethod(strC, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f16367d));
                        break;
                    case 1:
                        cls.getMethod(strC, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f16368e));
                        break;
                    case 2:
                        cls.getMethod(strC, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f16371h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strC, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f16371h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strC, CharSequence.class).invoke(view, constraintAttribute.f16369f);
                        break;
                    case 5:
                        cls.getMethod(strC, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f16370g));
                        break;
                    case 6:
                        cls.getMethod(strC, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f16368e));
                        break;
                    case 7:
                        cls.getMethod(strC, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f16367d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbA = g.a(" Custom Attribute \"", str, "\" not found on ");
                sbA.append(cls.getName());
                Log.e("TransitionLayout", sbA.toString(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strC, e11);
            } catch (InvocationTargetException e12) {
                StringBuilder sbA2 = g.a(" Custom Attribute \"", str, "\" not found on ");
                sbA2.append(cls.getName());
                Log.e("TransitionLayout", sbA2.toString(), e12);
            }
        }
    }

    public final float a() {
        switch (this.f16366c.ordinal()) {
            case 0:
                return this.f16367d;
            case 1:
            case 6:
                return this.f16368e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f16370g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.f16366c.ordinal()) {
            case 0:
                fArr[0] = this.f16367d;
                return;
            case 1:
                fArr[0] = this.f16368e;
                return;
            case 2:
            case 3:
                int i10 = this.f16371h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f16370g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f16368e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.f16366c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.f16366c.ordinal()) {
            case 0:
            case 7:
                this.f16367d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f16368e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f16371h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f16369f = (String) obj;
                break;
            case 5:
                this.f16370g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f16368e = ((Float) obj).floatValue();
                break;
        }
    }
}
