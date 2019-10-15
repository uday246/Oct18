def compute_area(r):
  # declaring constant PI
  PI=3.14
  #formula PI r^2
  return PI*r*r;

radius=0.0
area=0.0
#reading radius from user
radius = float(input('Enter the radius of the circle in m: '))
#calling compute_area to get the area
area = compute_area(radius)
print(area)