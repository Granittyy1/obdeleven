package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: renamed from: io.grpc.internal.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JndiResourceResolverFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2213c0 implements DnsNameResolver.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Throwable f37526a;

    /* JADX INFO: renamed from: io.grpc.internal.c0$a */
    /* JADX INFO: compiled from: JndiResourceResolverFactory.java */
    public static final class a {
        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void a(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void b(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public final ArrayList c(String str) throws NamingException {
            Throwable th = C2213c0.f37526a;
            if (th != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", th);
            }
            String[] strArr = {"TXT"};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e10) {
                                a(all2, e10);
                                throw null;
                            }
                        }
                        all2.close();
                    } catch (NamingException e11) {
                        a(all, e11);
                        throw null;
                    }
                }
                all.close();
                initialDirContext.close();
                return arrayList;
            } catch (NamingException e12) {
                b(initialDirContext, e12);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.c0$b */
    /* JADX INFO: compiled from: JndiResourceResolverFactory.java */
    public static final class b implements DnsNameResolver.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Logger f37527b = Logger.getLogger(b.class.getName());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f37528a;

        static {
            Pattern.compile("\\s+");
        }

        public b(a aVar) {
            this.f37528a = aVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        @Override // io.grpc.internal.DnsNameResolver.d
        public final List<String> a(String str) throws NamingException {
            Level level = Level.FINER;
            Logger logger = f37527b;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            ArrayList<String> arrayListC = this.f37528a.c(B7.b.c("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(arrayListC.size())});
            }
            ArrayList arrayList = new ArrayList(arrayListC.size());
            for (String str2 : arrayListC) {
                StringBuilder sb2 = new StringBuilder(str2.length());
                int i10 = 0;
                boolean z10 = false;
                while (i10 < str2.length()) {
                    char cCharAt = str2.charAt(i10);
                    if (z10) {
                        if (cCharAt == '\"') {
                            z10 = false;
                        } else {
                            if (cCharAt == '\\') {
                                i10++;
                                cCharAt = str2.charAt(i10);
                            }
                            sb2.append(cCharAt);
                        }
                    } else if (cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            z10 = true;
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    i10++;
                }
                arrayList.add(sb2.toString());
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e10) {
            e = e10;
        } catch (Error e11) {
            e = e11;
        } catch (RuntimeException e12) {
            e = e12;
        }
        f37526a = e;
    }

    @Override // io.grpc.internal.DnsNameResolver.e
    public final b a() {
        if (f37526a != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.DnsNameResolver.e
    public final Throwable b() {
        return f37526a;
    }
}
