ShapeArea (n){
int numMiddleBoxes = 1 + (2 * (n-1));
    int leftsideArea = 0;
    
    int boxesToAdd = numMiddleBoxes-2;
    
    while(boxesToAdd >= 1) {
        leftsideArea += boxesToAdd;
        boxesToAdd -= 2;
    }
    
    int area = (leftsideArea*2) + numMiddleBoxes;
    return area;
    }
