
# Java Swing Label Positioning Notes

These notes explain optional ways to **manually control the position and size of a `JLabel`** in a `JFrame`.  
By default, the **layout manager** will automatically center the label.

---

## Optional Manual Positioning

```java
// Set the position and dimensions of the label (optional)
label.setBounds(120, 120, 500, 500); // x, y, width, height

// Disable the layout manager to manually position the label
frame.setLayout(null);

// Set the dimensions of the frame (optional)
frame.setSize(500, 500);

// Prevent the frame from being resized by the user (optional)
frame.setResizable(false);
