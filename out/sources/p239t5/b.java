package p239t5;

import K5.o;
import P5.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: BadgeState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f47279b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f47281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f47282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f47283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f47284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f47285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47286i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f47287k;

    /* JADX INFO: compiled from: BadgeState.java */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0537a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public Integer f47288A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public Integer f47289B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public Integer f47290C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public Integer f47291D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public Boolean f47292E;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f47294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f47295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f47296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f47297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f47298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f47299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f47300i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f47301k;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Locale f47305o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f47306p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public CharSequence f47307q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f47308r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f47309s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Integer f47310t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Integer f47312v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Integer f47313w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Integer f47314x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Integer f47315y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Integer f47316z;
        public int j = 255;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f47302l = -2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f47303m = -2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f47304n = -2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Boolean f47311u = Boolean.TRUE;

        /* JADX INFO: renamed from: t5.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BadgeState.java */
        public class C0537a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                a aVar = new a();
                aVar.j = 255;
                aVar.f47302l = -2;
                aVar.f47303m = -2;
                aVar.f47304n = -2;
                aVar.f47311u = Boolean.TRUE;
                aVar.f47293b = parcel.readInt();
                aVar.f47294c = (Integer) parcel.readSerializable();
                aVar.f47295d = (Integer) parcel.readSerializable();
                aVar.f47296e = (Integer) parcel.readSerializable();
                aVar.f47297f = (Integer) parcel.readSerializable();
                aVar.f47298g = (Integer) parcel.readSerializable();
                aVar.f47299h = (Integer) parcel.readSerializable();
                aVar.f47300i = (Integer) parcel.readSerializable();
                aVar.j = parcel.readInt();
                aVar.f47301k = parcel.readString();
                aVar.f47302l = parcel.readInt();
                aVar.f47303m = parcel.readInt();
                aVar.f47304n = parcel.readInt();
                aVar.f47306p = parcel.readString();
                aVar.f47307q = parcel.readString();
                aVar.f47308r = parcel.readInt();
                aVar.f47310t = (Integer) parcel.readSerializable();
                aVar.f47312v = (Integer) parcel.readSerializable();
                aVar.f47313w = (Integer) parcel.readSerializable();
                aVar.f47314x = (Integer) parcel.readSerializable();
                aVar.f47315y = (Integer) parcel.readSerializable();
                aVar.f47316z = (Integer) parcel.readSerializable();
                aVar.f47288A = (Integer) parcel.readSerializable();
                aVar.f47291D = (Integer) parcel.readSerializable();
                aVar.f47289B = (Integer) parcel.readSerializable();
                aVar.f47290C = (Integer) parcel.readSerializable();
                aVar.f47311u = (Boolean) parcel.readSerializable();
                aVar.f47305o = (Locale) parcel.readSerializable();
                aVar.f47292E = (Boolean) parcel.readSerializable();
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f47293b);
            parcel.writeSerializable(this.f47294c);
            parcel.writeSerializable(this.f47295d);
            parcel.writeSerializable(this.f47296e);
            parcel.writeSerializable(this.f47297f);
            parcel.writeSerializable(this.f47298g);
            parcel.writeSerializable(this.f47299h);
            parcel.writeSerializable(this.f47300i);
            parcel.writeInt(this.j);
            parcel.writeString(this.f47301k);
            parcel.writeInt(this.f47302l);
            parcel.writeInt(this.f47303m);
            parcel.writeInt(this.f47304n);
            String str = this.f47306p;
            parcel.writeString(str != null ? str.toString() : null);
            CharSequence charSequence = this.f47307q;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            parcel.writeInt(this.f47308r);
            parcel.writeSerializable(this.f47310t);
            parcel.writeSerializable(this.f47312v);
            parcel.writeSerializable(this.f47313w);
            parcel.writeSerializable(this.f47314x);
            parcel.writeSerializable(this.f47315y);
            parcel.writeSerializable(this.f47316z);
            parcel.writeSerializable(this.f47288A);
            parcel.writeSerializable(this.f47291D);
            parcel.writeSerializable(this.f47289B);
            parcel.writeSerializable(this.f47290C);
            parcel.writeSerializable(this.f47311u);
            parcel.writeSerializable(this.f47305o);
            parcel.writeSerializable(this.f47292E);
        }
    }

    public b(Context context) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        a aVar = new a();
        int i10 = aVar.f47293b;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), MetricTracker.Object.BADGE)) {
                    throw new XmlPullParserException("Must have a <" + ((Object) MetricTracker.Object.BADGE) + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = o.d(context, attributeSet, p204q5.a.f46110c, R.attr.badgeStyle, styleAttribute == 0 ? 2132018522 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f47280c = typedArrayD.getDimensionPixelSize(4, -1);
        this.f47286i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f47281d = typedArrayD.getDimensionPixelSize(14, -1);
        this.f47282e = typedArrayD.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f47284g = typedArrayD.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f47283f = typedArrayD.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f47285h = typedArrayD.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f47287k = typedArrayD.getInt(24, 1);
        a aVar2 = this.f47279b;
        int i11 = aVar.j;
        aVar2.j = i11 == -2 ? 255 : i11;
        int i12 = aVar.f47302l;
        if (i12 != -2) {
            aVar2.f47302l = i12;
        } else if (typedArrayD.hasValue(23)) {
            this.f47279b.f47302l = typedArrayD.getInt(23, 0);
        } else {
            this.f47279b.f47302l = -1;
        }
        String str = aVar.f47301k;
        if (str != null) {
            this.f47279b.f47301k = str;
        } else if (typedArrayD.hasValue(7)) {
            this.f47279b.f47301k = typedArrayD.getString(7);
        }
        a aVar3 = this.f47279b;
        aVar3.f47306p = aVar.f47306p;
        CharSequence charSequence = aVar.f47307q;
        aVar3.f47307q = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar4 = this.f47279b;
        int i13 = aVar.f47308r;
        aVar4.f47308r = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = aVar.f47309s;
        aVar4.f47309s = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = aVar.f47311u;
        aVar4.f47311u = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar5 = this.f47279b;
        int i15 = aVar.f47303m;
        aVar5.f47303m = i15 == -2 ? typedArrayD.getInt(21, -2) : i15;
        a aVar6 = this.f47279b;
        int i16 = aVar.f47304n;
        aVar6.f47304n = i16 == -2 ? typedArrayD.getInt(22, -2) : i16;
        a aVar7 = this.f47279b;
        Integer num = aVar.f47297f;
        aVar7.f47297f = Integer.valueOf(num == null ? typedArrayD.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        a aVar8 = this.f47279b;
        Integer num2 = aVar.f47298g;
        aVar8.f47298g = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(6, 0) : num2.intValue());
        a aVar9 = this.f47279b;
        Integer num3 = aVar.f47299h;
        aVar9.f47299h = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        a aVar10 = this.f47279b;
        Integer num4 = aVar.f47300i;
        aVar10.f47300i = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(16, 0) : num4.intValue());
        a aVar11 = this.f47279b;
        Integer num5 = aVar.f47294c;
        aVar11.f47294c = Integer.valueOf(num5 == null ? c.a(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        a aVar12 = this.f47279b;
        Integer num6 = aVar.f47296e;
        aVar12.f47296e = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = aVar.f47295d;
        if (num7 != null) {
            this.f47279b.f47295d = num7;
        } else if (typedArrayD.hasValue(9)) {
            this.f47279b.f47295d = Integer.valueOf(c.a(context, typedArrayD, 9).getDefaultColor());
        } else {
            int iIntValue = this.f47279b.f47296e.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, p204q5.a.f46104H);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListA = c.a(context, typedArrayObtainStyledAttributes, 3);
            c.a(context, typedArrayObtainStyledAttributes, 4);
            c.a(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i17 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i17, 0);
            typedArrayObtainStyledAttributes.getString(i17);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            c.a(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, p204q5.a.f46128v);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f47279b.f47295d = Integer.valueOf(colorStateListA.getDefaultColor());
        }
        a aVar13 = this.f47279b;
        Integer num8 = aVar.f47310t;
        aVar13.f47310t = Integer.valueOf(num8 == null ? typedArrayD.getInt(2, 8388661) : num8.intValue());
        a aVar14 = this.f47279b;
        Integer num9 = aVar.f47312v;
        aVar14.f47312v = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        a aVar15 = this.f47279b;
        Integer num10 = aVar.f47313w;
        aVar15.f47313w = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        a aVar16 = this.f47279b;
        Integer num11 = aVar.f47314x;
        aVar16.f47314x = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(18, 0) : num11.intValue());
        a aVar17 = this.f47279b;
        Integer num12 = aVar.f47315y;
        aVar17.f47315y = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(25, 0) : num12.intValue());
        a aVar18 = this.f47279b;
        Integer num13 = aVar.f47316z;
        aVar18.f47316z = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(19, aVar18.f47314x.intValue()) : num13.intValue());
        a aVar19 = this.f47279b;
        Integer num14 = aVar.f47288A;
        aVar19.f47288A = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(26, aVar19.f47315y.intValue()) : num14.intValue());
        a aVar20 = this.f47279b;
        Integer num15 = aVar.f47291D;
        aVar20.f47291D = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num15.intValue());
        a aVar21 = this.f47279b;
        Integer num16 = aVar.f47289B;
        aVar21.f47289B = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        a aVar22 = this.f47279b;
        Integer num17 = aVar.f47290C;
        aVar22.f47290C = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        a aVar23 = this.f47279b;
        Boolean bool2 = aVar.f47292E;
        aVar23.f47292E = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = aVar.f47305o;
        if (locale == null) {
            this.f47279b.f47305o = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f47279b.f47305o = locale;
        }
        this.f47278a = aVar;
    }
}
