using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp4
{
    public partial class sifreleme : Form
    {
        public sifreleme()
        {
            InitializeComponent();
        }

        public static byte[] ByteDonustur(string deger)
        {

            UnicodeEncoding ByteConverter = new UnicodeEncoding();
            return ByteConverter.GetBytes(deger);

        }

        public static byte[] Byte8(string deger)
        {
            char[] arrayChar = deger.ToCharArray();
            byte[] arrayByte = new byte[arrayChar.Length];
            for (int i = 0; i < arrayByte.Length; i++)
            {
                arrayByte[i] = Convert.ToByte(arrayChar[i]);
            }
            return arrayByte;
        }
        public string MD5(string strGiris)
        {
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok");
            }
            else
            {
                MD5CryptoServiceProvider sifre = new MD5CryptoServiceProvider();
                byte[] arySifre = ByteDonustur(strGiris);
                byte[] aryHash = sifre.ComputeHash(arySifre);
                return BitConverter.ToString(aryHash);
            }
        }
        public string SHA1(string strGiris)
        {
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                SHA1CryptoServiceProvider sifre = new SHA1CryptoServiceProvider();
                byte[] arySifre = ByteDonustur(strGiris);
                byte[] aryHash = sifre.ComputeHash(arySifre);
                return BitConverter.ToString(aryHash);
            }
        }
        public string SHA256(string strGiris)
        {
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek Veri Yok");
            }
            else
            {
                SHA256Managed sifre = new SHA256Managed();
                byte[] arySifre = ByteDonustur(strGiris);
                byte[] aryHash = sifre.ComputeHash(arySifre);
                return BitConverter.ToString(aryHash);
            }
        }
        public string SHA384(string strGiris)
        {
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri bulunamadı.");
            }
            else
            {
                SHA384Managed sifre = new SHA384Managed();
                byte[] arySifre = ByteDonustur(strGiris);
                byte[] aryHash = sifre.ComputeHash(arySifre);
                return BitConverter.ToString(aryHash);
            }
        }
        public string SHA512(string strGiris)
        {
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                SHA512Managed sifre = new SHA512Managed();
                byte[] arySifre = ByteDonustur(strGiris);
                byte[] aryHash = sifre.ComputeHash(arySifre);
                return BitConverter.ToString(aryHash);
            }
        }
        /**/

        public string DESSifrele(string strGiris)
        {
            string sonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok");
            }
            else
            {
                byte[] aryKey = Byte8("12345678"); // BURAYA 8 bit string DEĞER GİRİN
                byte[] aryIV = Byte8("12345678"); // BURAYA 8 bit string DEĞER GİRİN
                DESCryptoServiceProvider cryptoProvider = new DESCryptoServiceProvider();
                MemoryStream ms = new MemoryStream();
                CryptoStream cs = new CryptoStream(ms, cryptoProvider.CreateEncryptor(aryKey, aryIV), CryptoStreamMode.Write);
                StreamWriter writer = new StreamWriter(cs);
                writer.Write(strGiris);
                writer.Flush();
                cs.FlushFinalBlock();
                writer.Flush();
                sonuc = Convert.ToBase64String(ms.GetBuffer(), 0, (int)ms.Length);
                writer.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return sonuc;
        }

        public string DESCoz(string strGiris)
        {
            string strSonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("12345678");
                byte[] aryIV = Byte8("12345678");
                DESCryptoServiceProvider cryptoProvider = new DESCryptoServiceProvider();
                MemoryStream ms = new MemoryStream(Convert.FromBase64String(strGiris));
                CryptoStream cs = new CryptoStream(ms, cryptoProvider.CreateDecryptor(aryKey, aryIV), CryptoStreamMode.Read);
                StreamReader reader = new StreamReader(cs);
                strSonuc = reader.ReadToEnd();
                reader.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return strSonuc;
        }
        /*Trple des*/
        /*public string Sifrele(string strGiris)
        {
            string sonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("asd12312aksdjlas");
                byte[] aryIV = Byte8("ajsj123");
                TripleDESCryptoServiceProvider dec = new TripleDESCryptoServiceProvider();
                MemoryStream ms = new MemoryStream();
                CryptoStream cs = new CryptoStream(ms, dec.CreateEncryptor(aryKey, aryIV), CryptoStreamMode.Write);
                StreamWriter writer = new StreamWriter(cs);
                writer.Write(strGiris);
                writer.Flush();
                cs.FlushFinalBlock();
                writer.Flush();
                sonuc = Convert.ToBase64String(ms.GetBuffer(), 0, (int)ms.Length);
                writer.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return sonuc;
        }*/

        public string Coz(string strGiris)
        {
            string strSonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("123456781234567812345678");
                byte[] aryIV = Byte8("12345678");
                TripleDESCryptoServiceProvider cryptoProvider = new TripleDESCryptoServiceProvider();
                MemoryStream ms = new MemoryStream(Convert.FromBase64String(strGiris));
                CryptoStream cs = new CryptoStream(ms, cryptoProvider.CreateDecryptor(aryKey, aryIV), CryptoStreamMode.Read);
                StreamReader reader = new StreamReader(cs);
                strSonuc = reader.ReadToEnd();
                reader.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return strSonuc;
        }
        public string Sifrelerc2(string strGiris)
        {
            string sonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("12345678");
                byte[] aryIV = Byte8("12345678");
                RC2CryptoServiceProvider dec = new RC2CryptoServiceProvider();
                MemoryStream ms = new MemoryStream();
                CryptoStream cs = new CryptoStream(ms, dec.CreateEncryptor(aryKey, aryIV), CryptoStreamMode.Write);
                StreamWriter writer = new StreamWriter(cs);
                writer.Write(strGiris);
                writer.Flush();
                cs.FlushFinalBlock();
                writer.Flush();
                sonuc = Convert.ToBase64String(ms.GetBuffer(), 0, (int)ms.Length);
                writer.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return sonuc;
        }

        public string Cozrc2(string strGiris)
        {
            string strSonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifresi çözülecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("12345678");
                byte[] aryIV = Byte8("12345678");
                RC2CryptoServiceProvider cp = new RC2CryptoServiceProvider();
                MemoryStream ms = new MemoryStream(Convert.FromBase64String(strGiris));
                CryptoStream cs = new CryptoStream(ms, cp.CreateDecryptor(aryKey, aryIV), CryptoStreamMode.Read);
                StreamReader reader = new StreamReader(cs);
                strSonuc = reader.ReadToEnd();
                reader.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return strSonuc;
        }
        /*rjidantel*/
        public string Sifrelerji(string strGiris)
        {
            string sonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("12345678");
                byte[] aryIV = Byte8("1234567812345678");
                RijndaelManaged dec = new RijndaelManaged();
                dec.Mode = CipherMode.CBC;
                MemoryStream ms = new MemoryStream();
                CryptoStream cs = new CryptoStream(ms, dec.CreateEncryptor(aryKey, aryIV), CryptoStreamMode.Write);
                StreamWriter writer = new StreamWriter(cs);
                writer.Write(strGiris);
                writer.Flush();
                cs.FlushFinalBlock();
                writer.Flush();
                sonuc = Convert.ToBase64String(ms.GetBuffer(), 0, (int)ms.Length);
                writer.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return sonuc;
        }

        public string Cozrji(string strGiris)
        {
            string strSonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Şifrezi çözülecek veri yok.");
            }
            else
            {
                byte[] aryKey = Byte8("12345678");
                byte[] aryIV = Byte8("1234567812345678");
                RijndaelManaged cp = new RijndaelManaged();
                MemoryStream ms = new MemoryStream(Convert.FromBase64String(strGiris));
                CryptoStream cs = new CryptoStream(ms, cp.CreateDecryptor(aryKey, aryIV), CryptoStreamMode.Read);
                StreamReader reader = new StreamReader(cs);
                strSonuc = reader.ReadToEnd();
                reader.Dispose();
                cs.Dispose();
                ms.Dispose();
            }
            return strSonuc;
        }
        /**/
        public string Sifreleasi(string strGiris, out RSAParameters prm)
        {
            string strSonuc = "";
            if (strGiris == "")
            {
                throw new ArgumentNullException("Şifrelenecek veri yok.");
            }
            else
            {
                byte[] aryDizi = ByteDonustur(strGiris);
                RSACryptoServiceProvider dec = new RSACryptoServiceProvider();
                prm = dec.ExportParameters(true);
                byte[] aryDonus = dec.Encrypt(aryDizi, false);
                strSonuc = Convert.ToBase64String(aryDonus);
            }
            return strSonuc;
        }

        public string Cozasi(string strGiris, RSAParameters prm)
        {
            string strSonuc = "";
            if (strGiris == "" || strGiris == null)
            {
                throw new ArgumentNullException("Çözülecek kayıt yok");
            }
            else
            {
                RSACryptoServiceProvider dec = new RSACryptoServiceProvider();
                byte[] aryDizi = Convert.FromBase64String(strGiris);
                UnicodeEncoding UE = new UnicodeEncoding();
                dec.ImportParameters(prm);
                byte[] aryDonus = dec.Decrypt(aryDizi, false);
                strSonuc = UE.GetString(aryDonus);
            }
            return strSonuc;
        }/*
        public string Encrypt(string Text)
        {
            var publicKey = "123456789";
            // RSA Public Key'i buraya yazmalısınız.
            // Yukarıda verdiğim linkte görebilirsiniz.
            var testData = Encoding.UTF8.GetBytes(Text);
            using (var rsa = new RSACryptoServiceProvider(1024))
            {
                try
                {
                    rsa.FromXmlString(publicKey.ToString());
                    var encryptedData = rsa.Encrypt(testData, true);
                    var base64Encrypted = Convert.ToBase64String(encryptedData);
                    return base64Encrypted;
                }
                finally
                {
                    rsa.PersistKeyInCsp = false;
                }
            }
        }*/
        string md5_t, sha1_t, sha256_t, sha384_t, sha512_t, des_t, triple_t, rc2_t, rji_t, rsa_t,yazi;

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Trim().ToString()!="")
            {
                yazi = textBox1.Text.Trim().ToString();
                md5_t = MD5(yazi);
                sha1_t = SHA1(yazi);
                sha256_t = SHA256(yazi);
                sha384_t = SHA384(yazi);
                sha512_t = SHA512(yazi);
                des_t = DESSifrele(yazi);
                //triple_t = Sifrele(yazi);
                rc2_t = Sifrelerc2(yazi);
                rji_t = Sifrelerji(yazi);
                //rsa_t = Encrypt(yazi);
                textBox2.Text = md5_t.ToString();
                textBox3.Text = sha1_t.ToString();
                textBox4.Text = sha256_t.ToString();
                textBox5.Text = sha384_t.ToString();
                textBox6.Text = sha512_t.ToString();
                textBox7.Text = des_t.ToString();
                //textBox8.Text = triple_t.ToString();
                textBox9.Text = rc2_t.ToString();
                textBox10.Text = rji_t.ToString();
                //textBox11.Text = rsa_t.ToString();
            }
            else
            {
                
            }
        }
    }
}
