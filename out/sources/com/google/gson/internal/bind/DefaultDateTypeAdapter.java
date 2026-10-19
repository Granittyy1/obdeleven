package com.google.gson.internal.bind;

import C7.g;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28859c = new m() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DefaultDateTypeAdapter(a.f28862a);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f28860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28861b;

    public DefaultDateTypeAdapter() {
        throw null;
    }

    public DefaultDateTypeAdapter(a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f28861b = arrayList;
        Objects.requireNonNull(aVar);
        this.f28860a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.f28967a >= 9) {
            arrayList.add(new SimpleDateFormat(O.a.f("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(M7.a aVar) throws IOException {
        Date dateB;
        if (aVar.y0() == JsonToken.j) {
            aVar.n0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this.f28861b) {
            try {
                for (DateFormat dateFormat : this.f28861b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strR0);
                            dateFormat.setTimeZone(timeZone);
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    dateB = J7.a.b(strR0, new ParsePosition(0));
                } catch (ParseException e10) {
                    StringBuilder sbA = g.a("Failed parsing '", strR0, "' as Date; at path ");
                    sbA.append(aVar.B());
                    throw new JsonSyntaxException(sbA.toString(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f28860a.a(dateB);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f28861b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.x();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f28861b.get(0);
        synchronized (this.f28861b) {
            str = dateFormat.format(date);
        }
        bVar.j0(str);
    }

    public static abstract class a<T extends Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0286a f28862a = new C0286a(Date.class);

        public a(Class<T> cls) {
        }

        public abstract T a(Date date);

        /* JADX INFO: renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        public class C0286a extends a<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            public final Date a(Date date) {
                return date;
            }
        }
    }
}
