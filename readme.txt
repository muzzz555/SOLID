SOLID 
S - Single responsibility principle
O - Open - closed principle
L - Liskov substitution principle
I - Interface segregation principle
D - Dependency inversion principle

Single responsibility principle
- Class 1 class ควรรับผิดชอบแค่อย่างเดียว
Ex 
- class จัดการวารสารควรมีแค่การ เพิ่ม ลบ วารสาร ไม่ควรมีการ saveFile

Open - closed principle
- Open for extension รองรับที่จะขยายได้
- closed for modification  ไม่สามารถเปลี่ยนแปลงได้
อะไรก็ตามที่มีอยู่แล้วเราจะพยายามให้มันไม่เปลี่ยนแปลง แต่เรารองรับเมื่อมี req เพิ่มขึ้น requirement ( กระทบการ test ใหม่ )
Ex  
- Shopee มีระบบการกรองสินค้าจาก สี ราคา ขนาด ต้องทำให้รองรับ requirement ที่เพิ่มมา เช่น ตามคะแนนดาว หรือแม้กระทั้งกรองสินค้าจาก ราคาและสี

L - Liskov substitution principle
- class แม่ทำได้ class ลูกก็ต้องทำได้ และถูกต้อง ไม่ผิดพลาด  

I - Interface segregation principle
- interface 1 ตัว ควรมีประสงค์แค่หนึ่งอย่าง (interface กำหนดพฤติกรรม : สิ่งของนี้จะเรียกว่าอย่างนี้ พฤติกรรมอะไร ต้องรับค่าอะไร ชื่ออะไร แสดงค่าอะไรออกมา เช่น พฤติกรรมการถ่ายรูป ว่าจะไป implements ต่อยังไง) 
Ex
- interface Machine ทำได้ทั้ง print, fax, scan เมื่อนำไป implements เป็น เครื่องพิมพ์เก่า มันไม่สามารถใช้ fax, scan ได้
- แก้โดยการแยก interface แต่ละอย่างออกไปเลย

D - Dependency inversion principle
- มองโปรแกรมเป็น 2 ส่วน คือ High-level(หยิบข้อมมูลมาใช้ในโปรแกรม interface ต่างๆ) และ Low-level(เก็บข้อมูลใน database)
- High-level ไม่ควรขึ้นกับ Low-level (ไม่ควรรู้ว่าใน Low-level ทำงานยังไง เช่น Model เปลี่ยน View ไม่ควรเปลี่ยน)
Ex
- เปลี่ยนการเก็บข้อมูลจาก List เป็น HashTable จะทำให้ class Research หาย
- แก้ สร้าง  interface RelationshipBrowser สร้างเป็นตัวหา เราไม่ควรไปหาเอง




